import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.NetPermission;
import java.util.HashMap;
import java.util.Scanner;

import javax.management.RuntimeMBeanException;


public class ControleDeArquivos{

public static final String PERSONAGEM = "PERSONAGEM";
public static final String CAPITULO = "CAPITULO";
public static final String ESCOLHA = "ESCOLHA";
public static String TEXTO = "TEXTO";

// Lê os dados dos personagens a partir do arquivo indicado pelo parâmetro pathFileCharacters
 
  HashMap<String,Personagem> receberPersonagem(String pathFileCharacters)
  {
  HashMap<String,Personagem> personagens= new HashMap<>();
  File FileCharacters = new File(pathFileCharacters);

  try (Scanner scannerDePersonagens = new Scanner(FileCharacters, "UTF-8")){

        String linhaDeDados = " ";
        String NOMEDOPERSONAGEM = " ";
        int ENERGIA = 0;
 // Procura a próxima ocorrência do marcador "PERSONAGEM"
      while(scannerDePersonagens.hasNext())
      {
         while(!linhaDeDados.equals(PERSONAGEM))
         {
              linhaDeDados = scannerDePersonagens.nextLine();
          }

            // Lê os dados do personagem atual
            linhaDeDados = scannerDePersonagens.nextLine();//NOME:
            NOMEDOPERSONAGEM = scannerDePersonagens.nextLine(); 
            linhaDeDados = scannerDePersonagens.nextLine();//ENERGIA:
            ENERGIA = Integer.parseInt(scannerDePersonagens.nextLine());
    // Cria um objeto Personagem e adiciona ao mapa de personagens
         Personagem personagem = new Personagem(NOMEDOPERSONAGEM, ENERGIA);
         personagens.put(NOMEDOPERSONAGEM, personagem);


      }

    scannerDePersonagens.close();
  } 

  catch (FileNotFoundException e)
  {
   throw new RuntimeException("Tem um erro no Código Personagem" + pathFileCharacters, e);
  }
  return personagens;
}

  HashMap<String,Capitulo> receberCapitulos(String pathFileCapitulos, HashMap<String, Personagem> personagens, Scanner RespostaUsuario)
  {
  HashMap<String,Capitulo> capitulos= new HashMap<>();
  File FileCapitulos = new File(pathFileCapitulos);

  try (Scanner scannerDosCapitulos = new Scanner(FileCapitulos, "UTF-8")){



      while(scannerDosCapitulos.hasNext())
      {
        String linhaDeDados = " ";
       

         while(!linhaDeDados.equals(CAPITULO) && !linhaDeDados.equals(ESCOLHA))
            {
              linhaDeDados = scannerDosCapitulos.nextLine();
            }
            if(linhaDeDados.equals(CAPITULO))
            {
              
            construtorDeCapitulo(personagens, RespostaUsuario, capitulos, scannerDosCapitulos);
          
            }
            else if(linhaDeDados.equals(ESCOLHA))
            {
              
              construtorDeEscolhas(capitulos, scannerDosCapitulos);
            
            }

       
      }
    scannerDosCapitulos.close();
  } 

  catch (FileNotFoundException e)
  {
   
   throw new RuntimeException("Tem um erro no Código receberCapitulo" + pathFileCapitulos, e);
    
  }
  return capitulos;
    
  }
  private void construtorDeEscolhas(HashMap<String, Capitulo> capitulos, Scanner scannerDosCapitulos) {
    String linhaDeDados;
    String capitloIn;
    String texto;
    String capitloOut;
    linhaDeDados = scannerDosCapitulos.nextLine();//CAPITULO DE ENTRADA
    capitloIn = scannerDosCapitulos.nextLine(); 
    linhaDeDados =  scannerDosCapitulos.nextLine();//TEXTO DA ESCOLHA
    texto = scannerDosCapitulos.nextLine();
    linhaDeDados = scannerDosCapitulos.nextLine();// CAPITULO DE SAIDA 
    capitloOut = scannerDosCapitulos.nextLine();

    Capitulo capituloIOrigem = capitulos.get(capitloIn);
    Capitulo capituloISaida = capitulos.get(capitloOut);
    capituloIOrigem.getEscolhas().add(new Escolha(texto, capituloISaida));

  }
  private void construtorDeCapitulo(HashMap<String, Personagem> personagens, Scanner RespostaUsuario, HashMap<String, Capitulo> capitulos,
      Scanner scannerDosCapitulos) {
    String linhaDeDados;
    String titulo;
    String texto = "";
    String nomePersonagem;
    int variacaoDeEnergia;
    linhaDeDados = scannerDosCapitulos.nextLine();//TITULO
    titulo = scannerDosCapitulos.nextLine(); 
    linhaDeDados =  scannerDosCapitulos.nextLine();//TEXTO
    linhaDeDados = "";
    while(!linhaDeDados.equals(PERSONAGEM))
    {
      
      texto += linhaDeDados + "\n";
      linhaDeDados = scannerDosCapitulos.nextLine();//NOME DO PERSONAGEM
      
    }

    nomePersonagem = scannerDosCapitulos.nextLine(); 
    linhaDeDados = scannerDosCapitulos.nextLine();//VARIAÇÃO DE ENERGIA 
    variacaoDeEnergia = Integer.parseInt(scannerDosCapitulos.nextLine());


    Capitulo chapter = new Capitulo(titulo, texto, personagens.get(nomePersonagem), variacaoDeEnergia, RespostaUsuario);
    capitulos.put(titulo, chapter);
  }
}
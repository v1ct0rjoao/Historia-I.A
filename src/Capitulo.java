

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {

   //====================================Atributos de classe=======================================//
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas; //agora aqui passa a ser uma objeto de escolha que tem texto e proximo capitulo
    private Personagem personagem;
    private int ModificadorDeEnergia;
   Scanner respostas = new Scanner(System.in);
   
   //====================================Construtor=======================================//
    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, 
    Personagem PersonaDoCapitulo,
     int AlteracaoDeEnergiaDoCapitulo, Scanner scan)

    {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.personagem = PersonaDoCapitulo;
        this.ModificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
        this.escolhas = new ArrayList<Escolha>();
        this.respostas = scan;
    }
   //====================================Metodo de mostrar o capitulo=======================================//


   public ArrayList<Escolha> getEscolhas(){
      return this.escolhas;
   }
   
    private void mostrar() {

      
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();

   //--------------------------------Verificar se tem algo no array------------------------------//
      if(escolhas != null){
        if(this.escolhas.size() > 0)
        {
         for (Escolha escolha : escolhas) {
         System.out.println(" --> " + escolha.getTexto());
         }
      }
   
   //--------------------------------Mudança de energia------------------------------//
  
         this.personagem.ModificadorDeEnergia(ModificadorDeEnergia);
         
     }
   }
   //====================================Metodos get e set =======================================//

   

   public void executar(){

        mostrar();
        int index = escolher();
        Capitulo novoCapitulo = escolhas.get(index).getProximo();
        novoCapitulo.executar();
   }

   // public void Progresso(Capitulo capituloDeParada){
    
   //    try {
   //      //classe que da pra salvar conteudo em um arquivo
   //     FileOutputStream fileProgress = new FileOutputStream("rsc/Arquivo.txt");
   //     ObjectOutputStream escritaDearquivo = new ObjectOutputStream(fileProgress);
      
   //     //esse objeto tem que escrevre no arquivo ne
   //      escritaDearquivo.writeObject(capituloDeParada);
   //      escritaDearquivo.close();
   //      fileProgress.close();
   //    } catch (IOException e) {
   //      // TODO Auto-generated catch block
   //      e.printStackTrace();
   //    }
   // }

   // public static Capitulo leituraDeArquivo(){

   //    Capitulo progresso = null;
   //     //nesse caso ele vai escrevre o que ta no capitulo no arquivo
   //     try {
   //       //classe que da pra salvar conteudo em um arquivo
   //      FileInputStream fileSave= new FileInputStream("rsc/Arquivo.txt");
   //      ObjectInputStream escrita = new ObjectInputStream(fileSave);
   //     progresso = (Capitulo) escrita.readObject();
   //      //esse objeto tem que escrevre no arquivo ne
   
   //       escrita.close();
   //       fileSave.close();
   //     } catch (IOException e) {
   //       // TODO Auto-generated catch block
   //       e.printStackTrace();
   //     }catch(ClassNotFoundException a){
   //        a.printStackTrace();
   //     }

   //      return progresso;
      
   //    }


      


   
  //====================================Metodo de escolher no texto=======================================//

    private int escolher() {
        
       Scanner leitor = new Scanner(System.in);
       int verificado = -1;
   
       if(escolhas != null)
      {
         while(verificado == -1)
         {
            String Resposta;
            if(this.escolhas.size() > 0){
               System.out.println();
             System.out.println("DIGITE: ");
               Resposta = leitor.next();
         
            for(int i = 0 ; i < escolhas.size(); i++ ) 
            {
              if(Resposta.equals(escolhas.get(i).getTexto()))
              {
               verificado = i;
               }
            }
          }  
         }      
      }
             return verificado;
   }

}
 

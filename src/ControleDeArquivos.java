import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ControleDeArquivos{

  HashMap<String,Personagem> receberPersonagem(String pathFileCharacters)
  {
  HashMap<String,Personagem> personagens= new HashMap<>();
  File FileCharacters = new File(pathFileCharacters);

  try 
  {
    Scanner scannerChar = new Scanner(FileCharacters, "UTF-8");
    String linhaDados = " ";
    String nomePersonagem = " ";
    int energia = 0;
    while(scannerChar.hasNext())
    {
     if(!linhaDados.equals("PERSONAGEM"))
     {
      linhaDados = scannerChar.nextLine();
     }
     linhaDados = scannerChar.nextLine();//NOME:
     nomePersonagem = scannerChar.nextLine(); 
     linhaDados = scannerChar.nextLine();//ENERGIA:
     energia = Integer.parseInt(scannerChar.nextLine());
     Personagem personagem = new Personagem(nomePersonagem, energia);
     personagens.put(nomePersonagem, personagem);
    }
    scannerChar.close();
   

  } catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  return personagens;
    
  }
}
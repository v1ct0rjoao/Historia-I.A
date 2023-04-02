
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Main {


    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner scan = new Scanner(System.in);
            ControleDeArquivos controle = new ControleDeArquivos();
    HashMap<String,Personagem> personagens =  controle.receberPersonagem("rsc/ArquivoDosPersonagens.txt");
    HashMap<String,Capitulo> capitulos =  controle.receberCapitulos("rsc/ArquivoDosCapitulos.txt", personagens, scan );
 
     Capitulo raiz = capitulos.get("A Figura Misteriosa");
     raiz.executar();
    }
}

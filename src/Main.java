
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Main {


    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner scan = new Scanner(System.in);
            ControleDeArquivos teste = new ControleDeArquivos();
    HashMap<String,Personagem> personagens =  teste.receberPersonagem("rsc/ArquivoDosPersonagens.txt");
    HashMap<String,Capitulo> capitulos =  teste.receberCapitulos("rsc/ArquivoDosCapitulos.txt", personagens, scan );
 
     Capitulo raiz = capitulos.get("A Figura Misteriosa");
     raiz.executar();
    }
}

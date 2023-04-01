
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Main {


    public static void main(String[] args) throws FileNotFoundException {
    
    ControleDeArquivos teste = new ControleDeArquivos();
    HashMap<String,Personagem> personagens =  teste.receberPersonagem("rsc/ArquivoDosPersonagens.txt");

    Personagem Alan = personagens.get("Alan");
    }
}

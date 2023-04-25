
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


class Main extends Application {

    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner scan = new Scanner(System.in);
            ControleDeArquivos controle = new ControleDeArquivos();
    HashMap<String,Personagem> personagens =  controle.receberPersonagem("rsc/ArquivoDosPersonagens.txt");
    HashMap<String,Capitulo> capitulos =  controle.receberCapitulos("rsc/ArquivoDosCapitulos.txt", personagens, scan );
 

    launch();
    
     Capitulo raiz = capitulos.get("A Figura Misteriosa");
     raiz.executar();
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}


import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


class Main extends Application {

    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner scan = new Scanner(System.in);
            ControleDeArquivos controle = new ControleDeArquivos();
    HashMap<String,Personagem> personagens =  controle.receberPersonagem("rsc/ArquivoDosPersonagens.txt");
    HashMap<String,Capitulo> capitulos =  controle.receberCapitulos("rsc/ArquivoDosCapitulos.txt", personagens, scan );
 

    launch(args);

     Capitulo raiz = capitulos.get("A Figura Misteriosa");
     raiz.executar();
    }

    @Override
    public void start(Stage arg0) throws Exception {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src\tela.fxml"));
      Parent root = fxmlLoader.load();
      Scene tela = new Scene(root);

      arg0.setTitle("Projeto de P2");
      arg0.setScene(tela);
      arg0.show();

     
    }
}

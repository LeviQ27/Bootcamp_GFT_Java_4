import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Desafio do Banco Digital ver@1.0.1");
        primaryStage
        .setScene(tela);
        primaryStage.show();
        
    }
    
}

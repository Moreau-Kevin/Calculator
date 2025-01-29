import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.*;
//import javafx.stage.StageStyle;
/*
 * DECORATED
 * UNDECORATED
 * TRANSPARENT
 */
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primarStage) throws Exception
    {
        Test myObj= new Test();
        //Test pour utiliser une classe dans un autre fichier
        //System.out.println(myObj.main());
        Color black = Color.BLACK;
        Color white=Color.WHITE;

        //Création du stack panel pour y mettre le bouton
        StackPane Panel= new StackPane();

        //Création de la scène
        Scene sc= new Scene(Panel, 500.0,500.0, white);

        //Création Bouton
        Button button = new Button("Click Me");

        //Coord du bouton
        button.setTranslateX(100);
        button.setTranslateY(100);

        //Définition de la taille du bouton via le ratio;
        button.setScaleX(2);
        button.setScaleY(1.5);
        
        //Rotation du bouton
        button.setRotate(90);

        //Ajout du bouton dans le Panel
        Panel.getChildren().add(button);

        //Préparation de la scène
        primarStage.setScene(sc);

        //Nom de la fenêtre
        primarStage.setTitle("Calculator");

        button.setOnAction((ActionEvent) ->{
            button.setRotate(button.getRotate()+90.0);
        });

        //Affichage de la scène
        primarStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

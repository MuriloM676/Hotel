package br.dell.modelos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Esta classe é responsável por criar o cadastro de cada hóspede
 * e gerenciar em cada quarto o hóspede irá ficar.
 *
 * @author Murilo Martins
 * @version 1.0
 */
public class Principal extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = FXMLLoader.load(getClass().getResource("Application.fxml"));
            Scene scene = new Scene(root, 360, 500);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package br.dell.modelos;
/**
 *Esta classe é responsável por criar o cadastro de cada hóspede
 *e gerenciar em cada quarto o hospede irá ficar.
 *
 * @author Murilo Martins
 * @version 4.0
 * @Param Principal recebe os dados do hóspede e cria um cadastro e depois aloca o hóspede em um quarto vazio.
 * @exception InputMismatchException valida de a idade contem apenas numeros do tipo int.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.*;
import java.net.URL;
import java.util.Objects;

public class Principal extends Application{
        @Override
    public void start(Stage primaryStage) {
        try{
           Pane root = FXMLLoader.load(getClass().getResource("Application.fxml"));
           Scene scene = new Scene(root,360,500);
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
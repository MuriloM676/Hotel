package br.dell.modelos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Controller {

    @FXML
    private TextField adress;

    @FXML
    private TextField age;

    @FXML
    private CheckBox chkin;

    @FXML
    private CheckBox ckhout;

    @FXML
    private TextField cpf;

    @FXML
    private RadioButton fem;

    @FXML
    private RadioButton masc;

    @FXML
    private TextField nameT;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private Button remove;

    @FXML
    private TextField rg;

    @FXML
    private Button search;

    @FXML
    void adrresT(ActionEvent event) {

    }
    ArrayList<String> hotel = new ArrayList();

    @FXML
    void btb_press(ActionEvent event) { // Buscar dados
        String nome = nameT.getText();
        String ende = adress.getText();
        long CPF = Long.parseLong(cpf.getText());
        long RG = Long.parseLong(rg.getText());
        int idade = Integer.parseInt(age.getText());
        System.out.println(hotel.toString());
    }

    @FXML
    void btr_press(ActionEvent event) { // Remover dados
        String nome = nameT.getText();
        String ende = adress.getText();
        long CPF = Long.parseLong(cpf.getText());
        long RG = Long.parseLong(rg.getText());
        int idade = Integer.parseInt(age.getText());

        Alert removeInfo = new Alert(Alert.AlertType.CONFIRMATION);
        if(removeInfo.showAndWait().get() == ButtonType.OK){
            hotel.remove(nome);
            hotel.remove(String.valueOf(CPF));
            hotel.remove(String.valueOf(RG));
        }
    }

    @FXML
    void bts_press(ActionEvent event) throws IOException { // Salvar dados
        String nome = nameT.getText();
        String ende = adress.getText();
        long CPF = Long.parseLong(cpf.getText());
        long RG = Long.parseLong(rg.getText());
        int idade = Integer.parseInt(age.getText());

        hotel.add(nome);
        hotel.add(String.valueOf(CPF));
        hotel.add(String.valueOf(RG));

        Alert salveInfo = new Alert(Alert.AlertType.INFORMATION);
        salveInfo.setTitle("Salvo");
        salveInfo.setHeaderText("Dados salvo com sucesso!!");
        salveInfo.showAndWait();
    }

    @FXML
    void cpfT(ActionEvent event) {

    }

    @FXML
    void idadeT(ActionEvent event) {

    }

    @FXML
    void nameT(ActionEvent event) {

    }

    @FXML
    void rgT(ActionEvent event) {

    }

}

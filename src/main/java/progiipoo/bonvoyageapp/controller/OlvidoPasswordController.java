package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OlvidoPasswordController {
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Label lblEmail;

    @FXML
    private TextField txtEmail;

    @FXML
    void onCancelarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/inicio.fxml");

    }

    @FXML
    void onConfirmarClick(ActionEvent event) {
        String email = txtEmail.getText();
        System.out.println("confirmo");
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Recupero de contraseña");
        alerta.setHeaderText(null);
        alerta.setContentText("Hemos enviado un mail con tu nueva contraseña.");
        alerta.show();
    }
}

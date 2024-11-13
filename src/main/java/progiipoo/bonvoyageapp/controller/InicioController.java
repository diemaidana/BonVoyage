package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import progiipoo.bonvoyageapp.model.gestores.GestorUsuarios;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.io.IOException;
import java.util.ArrayList;

public class InicioController {
    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Hyperlink hlkOlvidoPassword;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    private ArrayList<Usuario> usuarios;

    @FXML
    void onIniciarSesionClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente.fxml");



    }

    @FXML
    void onOlvidoPasswordClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/olvidoPassword.fxml");

    }

    @FXML
    void onRegistrarseClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/registrarUsuario.fxml");

    }
}

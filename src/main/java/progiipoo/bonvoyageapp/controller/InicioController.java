package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import progiipoo.bonvoyageapp.controller.Exceptions.InicioSesionIncorrectoException;
import progiipoo.bonvoyageapp.model.gestores.GestorUsuarios;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

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
        String email = txtUsuario.getText();
        String pass = txtPassword.getText();

        try {
            if (GestorUsuarios.iniciarSesion(email, pass)) {
                GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/sesionCliente.fxml");
            } else {
                throw new InicioSesionIncorrectoException("Usuario o password incorrecto.");
            }
        } catch (InicioSesionIncorrectoException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error al iniciar sesion");
            alerta.setHeaderText(null);
            alerta.setContentText("Usuario o password incorrecto. Intente nuevamente.");
            alerta.show();
            e.printStackTrace();
        }
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

package progiipoo.bonvoyageapp.controller;

import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.util.ArrayList;

public class inicioController {
    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Hyperlink hlkOlvidoPassword;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsuario;

    private ArrayList<Usuario> usuarios;

    @FXML
    void onIniciarSesionClick(ActionEvent event) {
        String email =  txtUsuario.getText();
        String password = txtPassword.getText();
        for (Usuario u : usuarios){
            if(u.getEmail().equals(email)){
                if(u.getPassword().equals(password)){
                    // CARGAR NUEVA VISTA
                }
            }
        }
        // INFORMAR QUE EMAIL O CONTRASENIA INCORRECTAS
    }

    @FXML
    void onOlvidoPasswordClick(ActionEvent event) {
        // CREAR VISTA PARA PREGUNTAR EMAIL
    }

    @FXML
    void onRegistrarseClick(ActionEvent event) {
        // CREAR FORMULARIO DE REGISTRO
    }
}

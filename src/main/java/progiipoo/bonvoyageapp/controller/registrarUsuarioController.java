package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.HelloApplication;
import progiipoo.bonvoyageapp.model.usuarios.Cliente;

public class registrarUsuarioController {
    @FXML
    private Label lblCiudad;

    @FXML
    private Label lblDNI;

    @FXML
    private Label lblDomicilio;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblPais;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblProvincia;

    @FXML
    private Label lblTelefono;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtDNI;

    @FXML
    private TextField txtDomicilio;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPais;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtProvincia;

    @FXML
    private TextField txtTelefono;

    @FXML
    void onCancelarClick(ActionEvent event) {

    }

    @FXML
    void onRegistrarClick(ActionEvent event) {
        Cliente c = new Cliente();

        c.setEmail(txtEmail.getText());
        c.setPassword(txtPassword.getText());
        c.setDni(txtDNI.getText());
        c.setTelefono(txtTelefono.getText());
        c.setDomicilio(txtDomicilio.getText());
        c.setCiudad(txtCiudad.getText());
        c.setProvincia(txtProvincia.getText());
        c.setPais(txtPais.getText());

        // LLAMAR A METODO DE GESTION DE USUARIOS Y REGISTRAR USUARIO
    }
}

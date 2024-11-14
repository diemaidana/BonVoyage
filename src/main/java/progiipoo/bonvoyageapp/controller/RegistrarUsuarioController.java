package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.model.gestores.GestorUsuarios;
import progiipoo.bonvoyageapp.model.usuarios.Cliente;

public class RegistrarUsuarioController {
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnRegistrar;

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
    private PasswordField txtPassword;

    @FXML
    private TextField txtProvincia;

    @FXML
    private TextField txtTelefono;

    @FXML
    void onCancelarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/inicio.fxml");

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

        GestorUsuarios.agregarUsuario(c);
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/sesionCliente.fxml", c);
    }
}

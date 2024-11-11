package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import progiipoo.bonvoyageapp.HelloApplication;
import progiipoo.bonvoyageapp.model.gestores.GestorUsuarios;
import progiipoo.bonvoyageapp.model.usuarios.Cliente;

import java.io.IOException;

public class registrarUsuarioController {
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
    private TextField txtPassword;

    @FXML
    private TextField txtProvincia;

    @FXML
    private TextField txtTelefono;

    @FXML
    void onCancelarClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/inicio.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 400,600);
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
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
    }
}

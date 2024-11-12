package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.io.IOException;

public class CrearVueloController {
    @FXML
    private Button btinConfirmarVuelo;

    @FXML
    private Button btnCancelar;

    @FXML
    private DatePicker dateVuelo;

    @FXML
    private TextField txtCiudadOrigen;

    @FXML
    private TextField txtCiudadDestino;

    @FXML
    private TextField txtPaisDestino;

    @FXML
    private TextField txtPaisOrigen;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtProvinciaDestino;

    @FXML
    private TextField txtProvinciaOrigen;

    @FXML
    void onCancelarClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/inicio.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void onConfirmarVueloClick(ActionEvent event) {
        Vuelo v = new Vuelo();
        v.setPaisOrigen(txtPaisOrigen.getText());
        v.setProvinciaOrigen(txtProvinciaOrigen.getText());
        v.setCiudadOrigen(txtCiudadOrigen.getText());
        v.setPaisDestino(txtPaisDestino.getText());
        v.setProvinciaDestino(txtProvinciaDestino.getText());
        v.setCiudadDestino(txtCiudadDestino.getText());
        v.setFechaVuelo(dateVuelo.getValue());
        v.setPrecio(Double.parseDouble(txtPrecio.getText()));

        // MODIFICAR CLASE CONTENEDORA
        //GestoraViaje.agregar(v);
    }
}

package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

public class crearAlojamiento {
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnCrear;
    @FXML
    private CheckBox checkFalse;
    @FXML
    private CheckBox checkTrue;
    @FXML
    private Label lblCiudad;
    @FXML
    private Label lblDomicilio;
    @FXML
    private Label lblPais;
    @FXML
    private Label lblPassword;
    @FXML
    private Label lblProvincia;
    @FXML
    private TextField txtCiudad;
    @FXML
    private TextField txtPais;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextField txtProvincia;
    @FXML
    void onCancelarClick(ActionEvent event) {

    }

    @FXML
    void onCrearClick(ActionEvent event) {
        Alojamiento a  = new Alojamiento();
        a.setPrecio(Double.parseDouble(txtPrecio.getText()));
        if(checkTrue.isSelected()){
            a.setDesayuno(checkTrue.isSelected());
        }
        else{
            a.setDesayuno(!checkFalse.isSelected());
        }
        a.setCiudad(txtCiudad.getText());
        a.setProvincia(txtProvincia.getText());
        a.setPais(txtPais.getText());

    }
}

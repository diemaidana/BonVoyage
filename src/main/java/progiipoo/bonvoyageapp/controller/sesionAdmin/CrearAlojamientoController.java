package progiipoo.bonvoyageapp.controller.sesionAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

public class CrearAlojamientoController {
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnCrear;
    @FXML
    private CheckBox chkDesayunoSi;
    @FXML
    private CheckBox chkDesayunoNo;
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
        if(chkDesayunoSi.isSelected()){
            a.setDesayuno(chkDesayunoSi.isSelected());
        }
        else{
            a.setDesayuno(chkDesayunoNo.isSelected());
        }
        a.setCiudad(txtCiudad.getText());
        a.setProvincia(txtProvincia.getText());
        a.setPais(txtPais.getText());

    }
}

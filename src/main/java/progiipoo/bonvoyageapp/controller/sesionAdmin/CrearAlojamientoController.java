package progiipoo.bonvoyageapp.controller.sesionAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import progiipoo.bonvoyageapp.controller.Exceptions.PrecioIncorrectoException;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestorJSONElemenViaje;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

public class CrearAlojamientoController {
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnCrear;

    @FXML
    private CheckBox chkDesayunoNo;

    @FXML
    private CheckBox chkDesayunoSi;

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
    private TextField txtNombre;

    @FXML
    private TextField txtPais;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtProvincia;

    @FXML
    private TextField txtUbicacion;
    @FXML
    void onCancelarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionAdmin/administrador.fxml");
    }

    @FXML
    void onCrearClick(ActionEvent event) {
        Alojamiento a  = new Alojamiento();
        String precio = txtPrecio.getText();
        try {
            for (int i = 0; i < precio.length(); i++) {
                if (!Character.isDigit(precio.charAt(i))) {
                    throw new PrecioIncorrectoException("Error! ingrese un valor numerico.");
                }
            }
        }catch (PrecioIncorrectoException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error!");
            alerta.setHeaderText(null);
            alerta.setContentText(e.getMessage());
            alerta.show();
        }

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
        a.setNombre(txtNombre.getText());
        a.setUbicacion(txtUbicacion.getText());

        GestoraViaje.agregarElemento(a);
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionAdmin/administrador.fxml");
    }
}

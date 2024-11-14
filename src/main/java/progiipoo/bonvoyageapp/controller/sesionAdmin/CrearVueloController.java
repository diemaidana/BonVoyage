package progiipoo.bonvoyageapp.controller.sesionAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.controller.Exceptions.PrecioIncorrectoException;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestorJSONElemenViaje;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

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
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionAdmin/administrador.fxml");
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

        v.setPrecio(Double.parseDouble(txtPrecio.getText()));

        GestoraViaje.agregarElemento(v);
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionAdmin/administrador.fxml");
    }
}

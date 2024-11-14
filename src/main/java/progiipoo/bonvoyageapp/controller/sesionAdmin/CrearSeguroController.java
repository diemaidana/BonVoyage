package progiipoo.bonvoyageapp.controller.sesionAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.controller.Exceptions.PrecioIncorrecto;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestorJSONElemenViaje;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;

public class CrearSeguroController {

    @FXML
    private Button btnConfirmarSeguro;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtAsistenciaMedica;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtMedicamentos;

    @FXML
    private TextField txtPerdidaDeEquipaje;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtTipoDeAsistencia;

    @FXML
    private TextField txtVueloDemorado;

    @FXML
    void onCancelarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionAdmin/administrador.fxml");
    }

    @FXML
    void onConfirmarSeguroClick(ActionEvent event) {
        SeguroViaje s = new SeguroViaje();

        s.setDestino(txtDestino.getText());
        s.setTipoAsistencia(txtTipoDeAsistencia.getText());
        s.setAsistenciaMedica(txtAsistenciaMedica.getText());
        s.setMedicamentos(txtMedicamentos.getText());
        s.setPerdidaEquipaje(txtPerdidaDeEquipaje.getText());
        s.setVueloDemorado(txtVueloDemorado.getText());
        String precio = txtPrecio.getText();
        try {
            for (int i = 0; i < precio.length(); i++) {
                if (!Character.isDigit(precio.charAt(i))) {
                    throw new PrecioIncorrecto("Error! ingrese un valor numerico.");
                }
            }
        }catch (PrecioIncorrecto e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error!");
            alerta.setHeaderText(null);
            alerta.setContentText(e.getMessage());
            alerta.show();
        }

        s.setPrecio(Double.parseDouble(txtPrecio.getText()));

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Seguro creado");
        alerta.setHeaderText(null);
        alerta.setContentText("Seguro creado con Exito!");
        alerta.show();

        GestoraViaje.agregarElemento(s);
        GestorJSONElemenViaje.guardarElemViaje(GestoraViaje.getLista());
    }
}

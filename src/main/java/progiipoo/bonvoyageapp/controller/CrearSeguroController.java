package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

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
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/administrador.fxml");
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
        s.setPrecio(Double.parseDouble(txtPrecio.getText()));

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Seguro creado");
        alerta.setHeaderText(null);
        alerta.show();
    }
}

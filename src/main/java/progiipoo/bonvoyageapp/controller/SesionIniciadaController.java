package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class SesionIniciadaController extends SesionClienteController {
    @FXML
    private Button btnAlojamiento;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnMiCuenta;

    @FXML
    private Button btnOfertas;

    @FXML
    private Button btnPaquetes;

    @FXML
    private Button btnSeguros;

    @FXML
    private Button btnVuelos;

    public SesionIniciadaController() {
        super();
    }

    public SesionIniciadaController(Usuario u) {
        super(u);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteAlojamiento.fxml");
    }

    @FXML
    void onCerrarSesionClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/inicio.fxml");
    }

    @FXML
    void onMiCuentaClick(ActionEvent event) {

    }

    @FXML
    void onOfertasClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente.fxml");
    }

    @FXML
    void onPaquetesClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClientePaquete.fxml");
    }

    @FXML
    void onSegurosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteSeguro.fxml");
    }

    @FXML
    void onVuelosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteVuelos.fxml");
    }
}

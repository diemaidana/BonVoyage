package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

public class SesionClientePaqueteController extends SesionClienteController{
    @FXML
    private Button btnAlojamiento;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnComprar;

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

    @FXML
    private TableColumn<?, ?> colAsistenciaMedica;

    @FXML
    private TableColumn<?, ?> colCantidadDias;

    @FXML
    private TableColumn<?, ?> colEquipaje;

    @FXML
    private TableColumn<?, ?> colMedicamentos;

    @FXML
    private TableColumn<?, ?> colTipoAsistencia;

    @FXML
    private TableColumn<?, ?> colVueloDemorado;

    @FXML
    private DatePicker partida;

    @FXML
    private DatePicker regreso;

    @FXML
    private TableView<?> tblVuelos;

    public SesionClientePaqueteController() {
        super();
    }

    public SesionClientePaqueteController(Usuario usuario) {
        super(usuario);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteAlojamiento.fxml");
    }

    @FXML
    void onBuscarClick(ActionEvent event) {

    }

    @FXML
    void onCerrarSesionClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/inicio.fxml");
    }

    @FXML
    void onComprarClick(ActionEvent event) {

    }

    @FXML
    void onMiCuentaClick(ActionEvent event) {

    }

    @FXML
    void onOfertasClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente.fxml", usuario);
    }

    @FXML
    void onPaquetesClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClientePaquete.fxml", usuario);
    }

    @FXML
    void onSegurosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteSeguro.fxml", usuario);
    }

    @FXML
    void onVuelosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionClienteVuelos.fxml", usuario);
    }
}

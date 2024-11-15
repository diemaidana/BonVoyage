package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.time.LocalDate;

public class VuelosController extends SesionClienteController {
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
    private DatePicker partida;

    @FXML
    private DatePicker regreso;

    @FXML
    private TableView<Vuelo> tblVuelos;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPais;

    @FXML
    private TableColumn<Vuelo, String> colCiudad;

    @FXML
    private TableColumn<Vuelo, String> colPartida;

    @FXML
    private TableColumn<Vuelo, String> colPrecio;

    public VuelosController() {
        super();
    }

    public VuelosController(Usuario usuario) {
        super(usuario);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml", usuario);
    }

    @FXML
    void onBuscarClick(ActionEvent event) {
        String ciudad = txtCiudad.getText();
        LocalDate fecha = partida.getValue();

        ObservableList<Vuelo> vuelos = FXCollections.observableArrayList(FXCollections.observableSet(GestoraViaje.getVuelos(ciudad, fecha)));

        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudadDestino"));
        colPartida.setCellValueFactory(new PropertyValueFactory<>("fechaVuelo"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        tblVuelos.setItems(vuelos);

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
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/sesionCliente.fxml", usuario);
    }

    @FXML
    void onPaquetesClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/paquete.fxml", usuario);
    }

    @FXML
    void onSegurosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/seguro.fxml", usuario);
    }

    @FXML
    void onVuelosClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/vuelos.fxml", usuario);
    }
}

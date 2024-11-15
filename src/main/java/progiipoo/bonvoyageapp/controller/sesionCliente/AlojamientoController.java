package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

import java.net.URL;
import java.util.ResourceBundle;

public class AlojamientoController extends SesionClienteController{
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
    private DatePicker checkIn;

    @FXML
    private DatePicker checkOut;

    @FXML
    private TableColumn<?, ?> colCiudad;

    @FXML
    private TableColumn<?, ?> colDesayuno;

    @FXML
    private TableColumn<?, ?> colHotel;

    @FXML
    private TableColumn<?, ?> colNoches;

    @FXML
    private TableColumn<?, ?> colPais;

    @FXML
    private TableColumn<?, ?> colPrecio;

    @FXML
    private TableColumn<?, ?> colPuntuacion;

    @FXML
    private TableView<Alojamiento> tblAlojamiento;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPais;

    public AlojamientoController() {
        super();
    }

    private ObservableList<Alojamiento> alojamientos;

    public AlojamientoController(Usuario usuario) {
        super(usuario);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml");
    }

    @FXML
    void onBuscarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event,"/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml");
        alojamientos = FXCollections.observableList(GestoraViaje.getAlojamientos(txtCiudad.getText(),txtPais.getText()));

        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colDesayuno.setCellValueFactory(new PropertyValueFactory<>("desayuno"));
        colPrecio.setCellValueFactory((new PropertyValueFactory<>("precio")));
        colPuntuacion.setCellValueFactory(new PropertyValueFactory<>("puntuacion"));
        colHotel.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tblAlojamiento.setItems(alojamientos);
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
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/paquete.fxml", usuario);
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

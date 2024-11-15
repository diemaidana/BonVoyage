package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.usuarios.Cliente;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

import java.net.URL;
import java.util.ResourceBundle;

public class AlojamientoController extends SesionClienteController implements Initializable {
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
    private TableColumn<Alojamiento, String> colCiudad;

    @FXML
    private TableColumn<Alojamiento, Boolean> colDesayuno;

    @FXML
    private TableColumn<Alojamiento, String> colHotel;

    @FXML
    private TableColumn<Alojamiento, String> colNoches;

    @FXML
    private TableColumn<Alojamiento, String> colPais;

    @FXML
    private TableColumn<Alojamiento, Double> colPrecio;

    @FXML
    private TableColumn<Alojamiento, Integer> colPuntuacion;

    @FXML
    private TableView<Alojamiento> tblAlojamiento;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPais;

    public AlojamientoController() {
        super();
    }

    private ObservableList<Alojamiento> alojamientos = FXCollections.observableArrayList();

    public AlojamientoController(Cliente usuario) {
        super(usuario);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml");
    }

    @FXML
    void onBuscarClick(ActionEvent event) {
//        GestorEscenas.abrirEscena(event,"/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml");
        String ciudad = txtCiudad.getText();
        String pais = txtPais.getText();

        alojamientos.clear();

        alojamientos.addAll(GestoraViaje.getAlojamientos(ciudad, pais));


        tblAlojamiento.setItems(alojamientos);

        txtCiudad.setText("");
        txtPais.setText("");
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colDesayuno.setCellValueFactory(new PropertyValueFactory<>("desayuno"));
        colPrecio.setCellValueFactory((new PropertyValueFactory<>("precio")));
        colPuntuacion.setCellValueFactory(new PropertyValueFactory<>("puntuacion"));
        colHotel.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colPais.setCellValueFactory(new PropertyValueFactory<>("pais"));
    }
}

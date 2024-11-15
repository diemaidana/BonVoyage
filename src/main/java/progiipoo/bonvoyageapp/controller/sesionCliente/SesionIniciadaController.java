package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.lang.reflect.Array;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SesionIniciadaController extends SesionClienteController implements Initializable {
    @FXML
    private Button btnAlojamiento;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnComprar;

    @FXML
    private Button btnMiCuenta;

    @FXML
    private Button btnOfertas;

    @FXML
    private Button btnSeguros;

    @FXML
    private Button btnVuelos;

    @FXML
    private TableColumn colCiudadAlojamiento;

    @FXML
    private TableColumn<Vuelo, String> colCiudadDestino;

    @FXML
    private TableColumn<Vuelo, String> colCiudadOrigen;

    @FXML
    private TableColumn colDesayunoAlojamiento;

    @FXML
    private TableColumn<Vuelo, LocalDate> colFecha;

    @FXML
    private TableColumn colNombreAlojamiento;

    @FXML
    private TableColumn<Vuelo, String> colPrecio;

    @FXML
    private TableColumn colPuntuacionAlojamiento;

    @FXML
    private TableColumn colUbicacionAlojamiento;

    @FXML
    private TableColumn colPrecioAlojamiento;

    @FXML
    private TableView<Alojamiento> tblAlojamiento;

    @FXML
    private TableView<Vuelo> tblVuelos;

    private ObservableList<Vuelo> vuelos;
    private ObservableList<Alojamiento> alojamientos;

    public SesionIniciadaController() {
        super();
    }

    public SesionIniciadaController(Usuario u) {
        super(u);
    }

    @FXML
    void onAlojamientoClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/alojamiento.fxml");
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


    @FXML
    void onComprarClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vuelos = FXCollections.observableList(GestoraViaje.getVuelosBaratos());

        colCiudadOrigen.setCellValueFactory(new PropertyValueFactory<>("ciudadOrigen"));
        colCiudadDestino.setCellValueFactory(new PropertyValueFactory<>("ciudadDestino"));
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fechaVuelo"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        tblVuelos.setItems(vuelos);

        alojamientos = FXCollections.observableList(GestoraViaje.getAlojamientos());
        colCiudadAlojamiento.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colDesayunoAlojamiento.setCellValueFactory(new PropertyValueFactory<>("desayuno"));
        colPrecioAlojamiento.setCellValueFactory((new PropertyValueFactory<>("precio")));
        colPuntuacionAlojamiento.setCellValueFactory(new PropertyValueFactory<>("puntuacion"));
        // jamas seteamos un valor de nombre.
        colNombreAlojamiento.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colUbicacionAlojamiento.setCellValueFactory(new PropertyValueFactory<>("ubicacion"));
    }
}

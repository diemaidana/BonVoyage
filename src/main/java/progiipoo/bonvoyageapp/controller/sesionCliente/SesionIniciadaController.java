package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.gestores.GestoraViaje;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
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

    @FXML
    private TableColumn<?, ?> colAlojamiento;

    @FXML
    private TableColumn<?, ?> colVuelo;

    @FXML
    private TableView<?> tblAlojamiento;

    @FXML
    private TableView<?> tblVuelos;

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
}

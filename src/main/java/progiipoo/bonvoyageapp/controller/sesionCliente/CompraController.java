package progiipoo.bonvoyageapp.controller.sesionCliente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import progiipoo.bonvoyageapp.controller.Exceptions.TarjetaInvalidaException;
import progiipoo.bonvoyageapp.controller.GestorEscenas;
import progiipoo.bonvoyageapp.model.MetodosDePago.TarjetaCredito;

public class CompraController {
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Label lblCompra;

    @FXML
    private PasswordField passCodSeguridad;

    @FXML
    private TextField txtAnioVencimiento;

    @FXML
    private TextField txtMesVencimiento;

    @FXML
    private TextField txtNumeroTarjeta;

    @FXML
    private TextField txtTitular;

    @FXML
    void onCancelarClick(ActionEvent event) {
        GestorEscenas.abrirEscena(event, "/progiipoo/bonvoyageapp/sesionCliente/sesionCliente.fxml");
    }

    @FXML
    void onConfirmarClick(ActionEvent event) throws TarjetaInvalidaException{
        String numeroTarjeta = txtNumeroTarjeta.getText();
        String nombreTitular = txtTitular.getText();
        String mesVencimiento = txtMesVencimiento.getText();
        String anioVencimiento = txtAnioVencimiento.getText();
        String codigoSeguridad = passCodSeguridad.getText();

        TarjetaCredito tarjeta = new TarjetaCredito(numeroTarjeta, nombreTitular, mesVencimiento, anioVencimiento, codigoSeguridad);

        try{
            if(!tarjeta.esValida()){
                throw new TarjetaInvalidaException("La tarjeta no es valida.");
            }

            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Compra confirmada!");
            alerta.setContentText("Tu compra fue confirmada con exito.");
            alerta.setHeaderText(null);
            alerta.show();


        }catch (TarjetaInvalidaException e){
            e.printStackTrace();
        }

    }
}

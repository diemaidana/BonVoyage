package progiipoo.bonvoyageapp.model.MetodosDePago;

public class ServiciosPago {
    private TarjetaCredito tarjeta;

    public ServiciosPago(TarjetaCredito tarjeta) {this.tarjeta = tarjeta;}

    public boolean procesarPago(double montoTotal) {

        if (this.tarjeta.esValida() && montoTotal>0){
            System.out.println("Pago procesado correctamente");
            return true;
        }else {
            System.out.println("Error al procesar el pago");
            return false;
        }
    }
}

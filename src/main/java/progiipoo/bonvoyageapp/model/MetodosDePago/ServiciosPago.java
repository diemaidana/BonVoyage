package progiipoo.bonvoyageapp.model.MetodosDePago;

public class ServiciosPago {
    private MetodoDePago metodoDePago;

    public ServiciosPago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public boolean procesarPago(double montoTotal) {

        if (metodoDePago.procesarPago(montoTotal)) {
            System.out.println("Pago procesado correctamente");
            return true;
        }
        System.out.println("Error al procesar el pago");
        return false;
    }
}

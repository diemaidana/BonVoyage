package progiipoo.bonvoyageapp.model.MetodosDePago;

import progiipoo.bonvoyageapp.model.usuarios.Cliente;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

public class ServicioCompra {
    private Cliente cliente;
    private Vuelo vuelo;
    private Alojamiento alojamiento;

    //constructor
    public ServicioCompra(Cliente cliente, Vuelo vuelo, Alojamiento alojamiento) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.alojamiento = alojamiento;
    }


    public boolean realizarCompra(double montoTotal, TarjetaCredito tarjeta) {

        ServiciosPago servicioPago = new ServiciosPago(tarjeta);

        return servicioPago.procesarPago(montoTotal);
    }
}
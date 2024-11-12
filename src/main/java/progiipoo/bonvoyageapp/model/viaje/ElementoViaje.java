package progiipoo.bonvoyageapp.model.viaje;

import java.util.UUID;

public class ElementoViaje {
    protected Double precio;

    // CONSTRUCTORES
    public ElementoViaje() {
        this.precio = null;
    }
    public ElementoViaje(Double precio) {
        this.precio = precio;
    }
    // SETTERS
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    // GETTERS
    public Double getPrecio() {
        return precio;
    }
}

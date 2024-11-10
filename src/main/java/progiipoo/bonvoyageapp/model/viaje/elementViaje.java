package progiipoo.bonvoyageapp.model.viaje;

import java.util.UUID;

public class elementViaje {
    protected UUID id;
    protected String destino;
    protected String fechaInicio;
    protected String fechaRegreso;
    protected Double precio;

    // CONSTRUCTORES
    public elementViaje() {
        UUID id = UUID.randomUUID();
        this.precio = null;
        this.fechaRegreso = null;
        this.fechaInicio = null;
        this.destino = null;
    }
    // CONSTRUCTORES CON VARAIBLES.
    public elementViaje(Double precio, String fechaRegreso, String fechaInicio, String destino) {
        UUID id = UUID.randomUUID();
        this.precio = precio;
        this.fechaRegreso = fechaRegreso;
        this.fechaInicio = fechaInicio;
        this.destino = destino;
    }
}

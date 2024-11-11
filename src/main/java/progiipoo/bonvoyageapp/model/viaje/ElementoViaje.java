package progiipoo.bonvoyageapp.model.viaje;

import java.util.UUID;

public class ElementoViaje {
    protected UUID id;
    protected String destino;
    protected String fechaInicio;
    protected String fechaRegreso;
    protected Double precio;

    // CONSTRUCTORES
    public ElementoViaje() {
        UUID id = UUID.randomUUID();
        this.precio = null;
        this.fechaRegreso = null;
        this.fechaInicio = null;
        this.destino = null;
    }
    // CONSTRUCTORES CON VARAIBLES.
    public ElementoViaje(Double precio, String fechaRegreso, String fechaInicio, String destino) {
        UUID id = UUID.randomUUID();
        this.precio = precio;
        this.fechaRegreso = fechaRegreso;
        this.fechaInicio = fechaInicio;
        this.destino = destino;
    }
    // SETTERS
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    // GETTERS
    public UUID getId() {
        return id;
    }
    public String getDestino() {
        return destino;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getFechaRegreso() {
        return fechaRegreso;
    }
    public Double getPrecio() {
        return precio;
    }
}

package progiipoo.bonvoyageapp.model.viaje;

import java.util.UUID;

public class ElementoViaje {
    protected String ciudad;
    protected String pais;
    protected String provincia;
    protected String fechaInicio;
    protected String fechaRegreso;
    protected Double precio;

    // CONSTRUCTORES
    public ElementoViaje() {
        this.precio = null;
        this.fechaRegreso = null;
        this.fechaInicio = null;
        this.ciudad = null;
        this.provincia = null;
        this.pais = null;
    }
    // CONSTRUCTORES CON VARAIBLES.
    public ElementoViaje(Double precio, String fechaRegreso, String fechaInicio, String ciudad, String provincia, String pais) {
        this.precio = precio;
        this.fechaRegreso = fechaRegreso;
        this.fechaInicio = fechaInicio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }
    // SETTERS
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setPais(String pais) {
        this.pais = pais;
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
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getFechaRegreso() {
        return fechaRegreso;
    }
    public Double getPrecio() {
        return precio;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getPais() {
        return pais;
    }
    public String getProvincia() {
        return provincia;
    }
}

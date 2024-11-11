package progiipoo.bonvoyageapp.model.viaje;

import java.time.LocalDate;

public class Vuelo {
    private String origen;
    private String destino;
    private LocalDate fechaVuelo;
    // CONSTRUCTORES
    public Vuelo() {
        this.origen = null;
        this.destino = null;
        this.fechaVuelo = null;
    }
    public Vuelo(String origen, String destino, LocalDate fechaVuelo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
    }
    // SETTERS
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setFechaVuelo(LocalDate fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
    // GETTERS
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }
}

package progiipoo.bonvoyageapp.model.viaje;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.Objects;

public final class Vuelo extends ElementoViaje{
    private String ciudadOrigen;
    private String paisOrigen;
    private String provinciaOrigen;
    private String ciudadDestino;
    private String paisDestino;
    private String provinciaDestino;
    private LocalDate fechaVuelo;

    // CONSTRUCTORES
    public Vuelo() {
        super();
        this.ciudadOrigen = null;
        this.paisOrigen = null;
        this.provinciaOrigen = null;
        this.ciudadDestino = null;
        this.paisDestino = null;
        this.provinciaDestino = null;
        this.fechaVuelo = null;
    }
    public Vuelo(Double precio, String ciudadOrigen, String paisOrigen, String provinciaOrigen, String ciudadDestino, String paisDestino, String provinciaDestino, LocalDate fechaVuelo) {
        super(precio);
        this.ciudadOrigen = ciudadOrigen;
        this.paisOrigen = paisOrigen;
        this.provinciaOrigen = provinciaOrigen;
        this.ciudadDestino = ciudadDestino;
        this.paisDestino = paisDestino;
        this.provinciaDestino = provinciaDestino;
        this.fechaVuelo = fechaVuelo;
    }

    public Vuelo(JSONObject obj) {
        super(obj.getDouble("precio"));
        this.ciudadOrigen = obj.getString("ciudadOrigen");
        this.paisOrigen = obj.getString("paisOrigen");
        this.provinciaOrigen = obj.getString("provinciaOrigen");
        this.ciudadDestino = obj.getString("ciudadDestino");
        this.paisDestino = obj.getString("paisDestino");
        this.provinciaDestino = obj.getString("provinciaDestino");
        this.fechaVuelo = LocalDate.parse(obj.getString("fechaVuelo"));
    }

    // SETTERS
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
    public void setProvinciaDestino(String provinciaDestino) {
        this.provinciaDestino = provinciaDestino;
    }
    public void setFechaVuelo(LocalDate fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
    // GETTERS


    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public JSONObject toJSON(){
        JSONObject obj = super.toJSON();
        try{
            obj.put("ciudadOrigen", this.ciudadOrigen);
            obj.put("paisOrigen", this.paisOrigen);
            obj.put("provinciaOrigen", this.provinciaOrigen);
            obj.put("ciudadDestino", this.ciudadDestino);
            obj.put("paisDestino", this.paisDestino);
            obj.put("provinciaDestino", this.provinciaDestino);
            obj.put("fechaVuelo", this.fechaVuelo);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "ciudadOrigen='" + ciudadOrigen + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", provinciaOrigen='" + provinciaOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", paisDestino='" + paisDestino + '\'' +
                ", provinciaDestino='" + provinciaDestino + '\'' +
                ", precio=" + precio +
                ", fechaVuelo=" + fechaVuelo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(ciudadOrigen, vuelo.ciudadOrigen) && Objects.equals(paisOrigen, vuelo.paisOrigen) && Objects.equals(provinciaOrigen, vuelo.provinciaOrigen) && Objects.equals(ciudadDestino, vuelo.ciudadDestino) && Objects.equals(paisDestino, vuelo.paisDestino) && Objects.equals(provinciaDestino, vuelo.provinciaDestino) && Objects.equals(fechaVuelo, vuelo.fechaVuelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudadOrigen, paisOrigen, provinciaOrigen, ciudadDestino, paisDestino, provinciaDestino, fechaVuelo);
    }
}

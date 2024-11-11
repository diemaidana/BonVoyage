package progiipoo.bonvoyageapp.model.viaje;

public class Alojamiento extends ElementoViaje {
    private int cantDias;
    private String ubicacion;
    private int puntuacion;
    private boolean desayuno;

    // CONSTRUCTOR VACIO
    public Alojamiento() {
        super();
        this.cantDias = 0;
        this.ubicacion = null;
        this.puntuacion = 0;
        this.desayuno = false;
    }
    // CONSTRUCTOR
    public Alojamiento(Double precio, String fechaRegreso, String fechaInicio, String destino, int cantDias, String ubicacion, int puntuacion, boolean desayuno) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.cantDias = cantDias;
        this.ubicacion = ubicacion;
        this.puntuacion = puntuacion;
        this.desayuno = desayuno;
    }
    // SETTERS
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }
    // GETTERS
    public int getCantDias() {
        return cantDias;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public boolean isDesayuno() {
        return desayuno;
    }
}

package progiipoo.bonvoyageapp.model.viaje;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alojamiento extends ElementoViaje {
    private int cantDias;
    private String ubicacion;
    private ArrayList<Integer> puntuacion;
    private boolean desayuno;

    // CONSTRUCTOR VACIO
    public Alojamiento() {
        super();
        this.cantDias = 0;
        this.ubicacion = null;
        this.puntuacion = new ArrayList<>();
        this.desayuno = false;
    }
    // CONSTRUCTOR
    public Alojamiento(Double precio, String fechaRegreso, String fechaInicio, String destino, int cantDias, String ubicacion, int puntuacion, boolean desayuno) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.cantDias = cantDias;
        this.ubicacion = ubicacion;
        this.puntuacion = new ArrayList<>();
        this.desayuno = desayuno;
    }
    // SETTERS
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion.add(puntuacion) ;
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
    public Integer getPuntuacion() {
        Integer promedio = 0;
        for(Integer i: this.puntuacion){
            promedio += i;
        }
        return Math.round(promedio / puntuacion.size());
    }
    public boolean isDesayuno() {
        return desayuno;
    }
}

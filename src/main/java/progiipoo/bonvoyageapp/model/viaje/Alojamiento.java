package progiipoo.bonvoyageapp.model.viaje;

import java.util.ArrayList;

public final class Alojamiento extends ElementoViaje {
    private int cantDias;
    private String ubicacion;
    private ArrayList<Integer> puntuacion;
    private boolean desayuno;
    protected String ciudad;
    protected String pais;
    protected String provincia;

    // CONSTRUCTOR VACIO
    public Alojamiento() {
        super();
        this.cantDias = 0;
        this.puntuacion = new ArrayList<>();
        this.desayuno = false;
    }
    // CONSTRUCTOR
    public Alojamiento(Double precio, int cantDias, String ubicacion, ArrayList<Integer> puntuacion, boolean desayuno, String ciudad, String pais, String provincia) {
        super(precio);
        this.cantDias = cantDias;
        this.ubicacion = ubicacion;
        this.puntuacion = puntuacion;
        this.desayuno = desayuno;
        this.ciudad = ciudad;
        this.pais = pais;
        this.provincia = provincia;
    }
    // TE VOY A AGREGAR UN COMENTARIO PARA PODER PUSHEAR
    // SETTERS
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion.add(puntuacion);
    }
    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    // GETTERS

    public int getCantDias() {
        return cantDias;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isDesayuno() {
        return desayuno;
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
    public Integer getPuntuacion() {
        Integer promedio = 0;
        for (Integer i : this.puntuacion) {
            promedio += i;
        }
        return Math.round(promedio / puntuacion.size());
    }
}

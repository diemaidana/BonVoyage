package progiipoo.bonvoyageapp.model.viaje;

public class alojamiento extends elementViaje{
    private int cantDias;
    private String ubicacion;
    private int puntuacion;
    private boolean desayuno;

    // CONSTRUCTOR VACIO
    public alojamiento() {
        super();
        this.cantDias = 0;
        this.ubicacion = null;
        this.puntuacion = 0;
        this.desayuno = false;
    }
    // CONSTRUCTOR
    public alojamiento(Double precio, String fechaRegreso, String fechaInicio, String destino, int cantDias, String ubicacion, int puntuacion, boolean desayuno) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.cantDias = cantDias;
        this.ubicacion = ubicacion;
        this.puntuacion = puntuacion;
        this.desayuno = desayuno;
    }
}

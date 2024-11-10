package progiipoo.bonvoyageapp.model.viaje;

public class vuelo extends elementViaje {
    private String origen;
    private float horasVuelo;

    // CONSTRUCTORES

    public vuelo() {
        super();
        this.origen = null;
        this.horasVuelo = 0;
    }

    public vuelo(Double precio, String fechaRegreso, String fechaInicio, String destino, String origen, float horasVuelo) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.origen = origen;
        this.horasVuelo = horasVuelo;
    }
}

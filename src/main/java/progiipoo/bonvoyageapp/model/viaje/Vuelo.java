package progiipoo.bonvoyageapp.model.viaje;

public class Vuelo extends ElementoViaje {
    private String origen;
    private float horasVuelo;

    // CONSTRUCTORES
    public Vuelo() {
        super();
        this.origen = null;
        this.horasVuelo = 0;
    }
    public Vuelo(Double precio, String fechaRegreso, String fechaInicio, String destino, String origen, float horasVuelo) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.origen = origen;
        this.horasVuelo = horasVuelo;
    }
}

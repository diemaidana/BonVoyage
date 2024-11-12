package progiipoo.bonvoyageapp.model.viaje;

public final class SeguroViaje extends ElementoViaje {
    private int cantDias;
    private String destinoContinente;

    // CONSTRUCTOR VACIO
    public SeguroViaje() {
        super();
        this.destinoContinente = null;
        this.cantDias = 0;
    }

    // CONSTRUCTOR
    public SeguroViaje(Double precio, String fechaRegreso, String fechaInicio, String ciudad, String provincia, String pais, int cantDias, String destinoContinente) {
        super(precio, fechaRegreso, fechaInicio, ciudad, provincia, pais);
        this.cantDias = cantDias;
        this.destinoContinente = destinoContinente;
    }

    // SETTERS
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public void setDestinoContinente(String destinoContinente) {
        this.destinoContinente = destinoContinente;
    }
    // GETTERS
    public int getCantDias() {
        return cantDias;
    }
    public String getDestinoContinente() {
        return destinoContinente;
    }
}

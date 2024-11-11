package progiipoo.bonvoyageapp.model.viaje;

public class SeguroViaje extends ElementoViaje {
    private int cantDias;
    private String destinoContinente;

    // CONSTRUCTOR VACIO
    public SeguroViaje() {
        super();
        this.destinoContinente = null;
        this.cantDias = 0;
    }

    // CONSTRUCTOR
    public SeguroViaje(Double precio, String fechaRegreso, String fechaInicio, String destino, String destinoContinente, int cantDias) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.destinoContinente = destinoContinente;
        this.cantDias = cantDias;
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

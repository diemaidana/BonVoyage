package progiipoo.bonvoyageapp.model.viaje;

public final class SeguroViaje extends ElementoViaje {
    private int cantDias;
    private String pais;

    // CONSTRUCTOR
    public SeguroViaje() {
        super();
        this.pais = null;
        this.cantDias = 0;
    }
    public SeguroViaje(Double precio, String pais, int cantDias) {
        super(precio);
        this.pais = pais;
        this.cantDias = cantDias;
    }

    // SETTERS
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    // GETTERS
    public int getCantDias() {
        return cantDias;
    }
    public String getPais() {
        return pais;
    }
}

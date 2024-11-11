package progiipoo.bonvoyageapp.model.viaje;

public class Paquete extends ElementoViaje {
    private int cantDias;

    // CONSTRUCTORES

    public Paquete() {
        this.cantDias = 0;
    }
    public Paquete(Double precio, String fechaRegreso, String fechaInicio, String ciudad, String provincia, String pais, int cantDias) {
        super(precio, fechaRegreso, fechaInicio, ciudad, provincia, pais);
        this.cantDias = cantDias;
    }
    // SETTER
    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    // GETTERS
    public int getCantDias() {
        return cantDias;
    }
}

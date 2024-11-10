package progiipoo.bonvoyageapp.model.viaje;

public class paquete extends elementViaje{
    private int cantDias;

    // CONSTRUCTORES
    public paquete() {
        super();
        this.cantDias = 0;
    }
    public paquete(Double precio, String fechaRegreso, String fechaInicio, String destino, int cantDias) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.cantDias = cantDias;
    }
}

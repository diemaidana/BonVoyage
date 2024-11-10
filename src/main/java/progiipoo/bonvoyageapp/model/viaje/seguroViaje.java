package progiipoo.bonvoyageapp.model.viaje;

public class seguroViaje extends elementViaje{
    private int cantDias;
    private String destinoContinente;

    // CONSTRUCTOR VACIO
    public seguroViaje() {
        super();
        this.destinoContinente = null;
        this.cantDias = 0;
    }
    // CONSTRUCTOR
    public seguroViaje(Double precio, String fechaRegreso, String fechaInicio, String destino, String destinoContinente, int cantDias) {
        super(precio, fechaRegreso, fechaInicio, destino);
        this.destinoContinente = destinoContinente;
        this.cantDias = cantDias;
    }
}

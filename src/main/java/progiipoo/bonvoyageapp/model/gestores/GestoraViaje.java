package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.contenedores.Contenedora;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;

public class GestoraViaje {
    private static Contenedora<ElementoViaje> paquete = new ContenedoraPaquete<>();

    public static void agregarAlojamiento(Alojamiento a) {
        paquete.agregarElemento(a);
    }
    public static void eliminarAlojamiento(Alojamiento a){
        paquete.eliminarElemento(a);
    }
    public static void contieneElemento(Alojamiento a){
        paquete.contieneElemento(a);
    }
    public static void agregarSeguro(SeguroViaje sv) {
        paquete.agregarElemento(sv);
    }
    public static void eliminarSeguro(SeguroViaje sv){
        paquete.eliminarElemento(sv);
    }
    public static void contieneElemento(SeguroViaje sv){
        paquete.contieneElemento(sv);
    }
}

package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;


public class GestoraViaje {
    private static Contenedora<ElementoViaje> lista = new Contenedora<ElementoViaje>();
    public static void agregarAlojamiento(Alojamiento a) {
        lista.agregarElemento(a);
    }
    public static void eliminarAlojamiento(Alojamiento a){
        lista.eliminarElemento(a);
    }
    public static void contieneElemento(Alojamiento a){
        lista.contieneElemento(a);
    }
    public static void agregarSeguro(SeguroViaje sv) {
        lista.agregarElemento(sv);
    }
    public static void eliminarSeguro(SeguroViaje sv){
        lista.eliminarElemento(sv);
    }
    public static void contieneElemento(SeguroViaje sv){
        lista.contieneElemento(sv);
    }
}

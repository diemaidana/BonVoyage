package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.util.ArrayList;
import java.util.Collections;

public class GestoraViaje {
    private static Contenedora<ElementoViaje> lista = new Contenedora<>();

    public static void leerElementosViaje(){
        lista = GestorJSONElemenViaje.leerElemViaje();
    }

    public static void agregarElemento(ElementoViaje e) {
        lista.agregarElemento(e);
    }

    public static void eliminarElemento(ElementoViaje e){
        lista.eliminarElemento(e);
    }

    public static void actualizarElemento(ElementoViaje e){
        lista.eliminarElemento(e);
        lista.actualizarElemento(e);
    }

    public static Boolean contieneElemento(ElementoViaje e){
        return lista.contieneElemento(e);
    }

    public static Contenedora<ElementoViaje> getLista() {
        return lista;
    }
}

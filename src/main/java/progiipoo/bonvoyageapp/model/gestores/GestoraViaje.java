package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.time.LocalDate;
import java.util.*;

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

    public static List<Vuelo> getVuelosBaratos(){
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(ElementoViaje e : lista){
            if(e.getClass().equals(Vuelo.class)){
                vuelos.add((Vuelo)e);
            }
        }
        Collections.sort(vuelos);
        if(vuelos.size() < 3){
            return vuelos.subList(0, vuelos.size());
        }
        return vuelos.subList(0,2);
    }

    public static Set<Vuelo> getVuelos(String ciudad, LocalDate fecha) {
        HashSet<Vuelo> vuelos = new HashSet<>();
        if(ciudad == null && fecha != null){
            vuelos = getVuelosPorFecha(fecha);
        }else if(ciudad != null && fecha == null){
            vuelos = getVuelosPorCiudad(ciudad);
        }else if(ciudad != null && fecha != null){
            for(ElementoViaje e : lista){
                if(e.getClass().equals(Vuelo.class)){
                    if(((Vuelo) e).getCiudadDestino().equals(ciudad)){
                        if(((Vuelo) e).getFechaVuelo().equals(fecha)){
                            vuelos.add((Vuelo)e);
                        }else if(((Vuelo) e).getFechaVuelo().getMonth().equals(fecha.getMonth())){
                            vuelos.add((Vuelo)e);
                        }
                    }
                }
            }
        }
        return vuelos;
    }

    private static HashSet<Vuelo> getVuelosPorCiudad(String ciudad) {
        HashSet<Vuelo> vuelos = new HashSet<>();
        for(ElementoViaje e : lista){
            if(e.getClass().equals(Vuelo.class)){
                if(((Vuelo) e).getCiudadDestino().equals(ciudad)){
                    vuelos.add((Vuelo)e);
                }
            }
        }
        return vuelos;
    }

    private static HashSet<Vuelo> getVuelosPorFecha(LocalDate fecha) {
        HashSet<Vuelo> vuelos = new HashSet<>();
        for(ElementoViaje e : lista){
            if(e.getClass().equals(Vuelo.class)){
                if(((Vuelo) e).getFechaVuelo().equals(fecha)){
                    vuelos.add((Vuelo)e);
                }else if(((Vuelo) e).getFechaVuelo().getMonth().equals(fecha.getMonth())){
                    vuelos.add((Vuelo)e);
                }
            }
        }
        return vuelos;
    }
}

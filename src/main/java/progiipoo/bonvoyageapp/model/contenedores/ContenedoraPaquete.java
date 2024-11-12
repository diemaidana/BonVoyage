package progiipoo.bonvoyageapp.model.contenedores;

import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.util.ArrayList;
import java.util.HashSet;

public class ContenedoraPaquete <T>{
    public ArrayList<T> paquete;

    public ContenedoraPaquete(){
        paquete = new ArrayList<>();
    }
    public void agregarElemento(T t){
        paquete.add(t);
    }
    public void eliminarElemento(T t){
        paquete.remove(t);
    }
    public Boolean contieneElemento(T t){
        return paquete.contains(t);
    }
}

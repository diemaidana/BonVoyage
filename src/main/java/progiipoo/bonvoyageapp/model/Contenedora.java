package progiipoo.bonvoyageapp.model;

import java.util.HashSet;
import java.util.Iterator;
public class Contenedora<T> implements Iterable<T>{
    private HashSet<T> lista;

    public Contenedora(){
        lista = new HashSet<>();
    }

    public void agregarElemento(T t){
        lista.add(t);
    }

    public void eliminarElemento(T t){
        lista.remove(t);
    }

    public Boolean contieneElemento(T t){
        return lista.contains(t);
    }

    public void actualizarElemento(T t){
        lista.remove(t);
        lista.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

    @Override
    public String toString() {
        String s = "";
        for (T t : lista){
            s += t.toString();
        }
        return s;
    }
}
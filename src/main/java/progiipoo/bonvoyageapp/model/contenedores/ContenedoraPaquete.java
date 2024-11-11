package progiipoo.bonvoyageapp.model.contenedores;

import java.util.ArrayList;

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

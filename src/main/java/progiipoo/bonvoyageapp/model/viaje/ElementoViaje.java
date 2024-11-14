package progiipoo.bonvoyageapp.model.viaje;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.UUID;

public class ElementoViaje implements Comparable{
    protected Double precio;

    // CONSTRUCTORES
    public ElementoViaje() {
        this.precio = null;
    }
    public ElementoViaje(Double precio) {
        this.precio = precio;
    }
    // SETTERS
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    // GETTERS
    public Double getPrecio() {
        return precio;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        try{
            json.put("precio", precio);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public int compareTo(Object o) {
        return precio.compareTo(((ElementoViaje)o).getPrecio());
    }
}

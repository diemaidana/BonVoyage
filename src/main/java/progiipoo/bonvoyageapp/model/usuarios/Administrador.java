package progiipoo.bonvoyageapp.model.usuarios;

import org.json.JSONException;
import org.json.JSONObject;

public final class Administrador extends Usuario {
    private String legajo;

    public Administrador() {
        super();
        legajo = "";
    }

    public Administrador(String email, String password, String dni, String nombre, String apellido, String legajo) {
        super(email, password, dni, nombre, apellido);
        this.legajo = legajo;
    }

    public Administrador(JSONObject json){
        super(json.getString("email"), json.getString("password"), json.getString("dni"), json.getString("nombre"), json.getString("apellido"));
        this.legajo = json.getString("legajo");
    }

    public JSONObject toJSON(){
        JSONObject json = super.toJSON();
        try{
            json.put("legajo", legajo);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public Boolean puedeCargar() {
        return true;
    }
}

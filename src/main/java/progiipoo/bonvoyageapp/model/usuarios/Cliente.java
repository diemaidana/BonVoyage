package progiipoo.bonvoyageapp.model.usuarios;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public final class Cliente extends Usuario{
    private String telefono;
    private String domicilio;
    private String ciudad;
    private String provincia;
    private String pais;

    public Cliente() {
        super();
        telefono = "";
        domicilio = "";
        ciudad = "";
        provincia = "";
        pais = "";
    }

    public Cliente(String email, String password, String dni, String telefono, String domicilio, String ciudad, String provincia, String pais, String nombre, String apellido) {
        super(email, password, dni, nombre, apellido);
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Cliente(JSONObject json){
        super(json.getString("email"), json.getString("password"), json.getString("dni"), json.getString("nombre"), json.getString("apellido"));
        this.telefono = json.getString("telefono");
        this.domicilio = json.getString("domicilio");
        this.ciudad = json.getString("ciudad");
        this.provincia = json.getString("provincia");
        this.pais = json.getString("pais");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public JSONObject toJSON(){
        JSONObject json = super.toJSON();
        try{
            json.put("telefono", telefono);
            json.put("domicilio", domicilio);
            json.put("ciudad", ciudad);
            json.put("provincia", provincia);
            json.put("pais", pais);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public Boolean puedeCargar() {
        return false;
    }


}

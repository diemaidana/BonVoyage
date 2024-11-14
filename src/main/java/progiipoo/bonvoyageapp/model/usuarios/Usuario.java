package progiipoo.bonvoyageapp.model.usuarios;

import org.json.JSONException;
import org.json.JSONObject;
import progiipoo.bonvoyageapp.model.interfaces.IpuedeCargar;

import java.util.Iterator;
import java.util.Objects;

public abstract class Usuario implements IpuedeCargar {
     private String email;
     private String dni;
     private String password;
     private String nombre;
     private String apellido;


    public Usuario() {
        email = "";
        password = "";
        dni = "";
        nombre = "";
        apellido = "";
    }

    public Usuario(String email, String password, String dni, String nombre, String apellido) {
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, dni);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        try{
            json.put("email", email);
            json.put("dni", dni);
            json.put("password", password);
            json.put("nombre", nombre);
            json.put("apellido", apellido);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public abstract Boolean puedeCargar();
}

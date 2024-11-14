package progiipoo.bonvoyageapp.model.gestores;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import progiipoo.bonvoyageapp.model.usuarios.Administrador;
import progiipoo.bonvoyageapp.model.usuarios.Cliente;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.util.HashMap;

public class GestorJSONUsuarios {
    private final static String archivo = "/archivos/usuarios.json";

    public static void guardarUsuarios(HashMap<String, Usuario> usuarios) {
        JSONObject json = new JSONObject();
        try{
            JSONArray arreglo = new JSONArray();
            for (Usuario usuario : usuarios.values()) {
                arreglo.put(usuario.toJSON());
            }
            json.put("usuarios", arreglo);
        }catch (JSONException e){
            e.printStackTrace();
        }
        OperacionesArchivos.guardar(json, archivo);
    }

    public static HashMap<String, Usuario> leerUsuarios() {
        HashMap<String, Usuario> usuarios = null;
        try{
            JSONObject json = new JSONObject(OperacionesArchivos.leer(archivo));
            usuarios = new HashMap<>();
            JSONArray arreglo = json.getJSONArray("usuarios");
            for (int i = 0; i < arreglo.length(); i++) {
                JSONObject usuario = arreglo.getJSONObject(i);
                if(usuario.has("email") && usuario.has("dni") && usuario.has("password") && usuario.has("nombre") && usuario.has("apellido")){
                    if(usuario.has("legajo")){
                        Administrador a = new Administrador(usuario);
                        usuarios.put(a.getEmail(), a);
                    }
                    if(usuario.has("telefono") && usuario.has("domicilio") && usuario.has("ciudad") && usuario.has("provincia") && usuario.has("pais")){
                        Cliente c = new Cliente(usuario);
                        usuarios.put(c.getEmail(), c);
                    }
                }
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return usuarios;
    }
}

package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.util.HashMap;

public class GestorUsuarios {
    private static HashMap<String, Usuario> usuarios = new HashMap<>();

    public static HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public static void leerUsuarios(){
        usuarios = GestorJSONUsuarios.leerUsuarios();
    }

    public static void agregarUsuario(Usuario u){
        usuarios.put(u.getEmail(), u);
    }

    public static void eliminarUsuario(Usuario u){
        usuarios.remove(u.getEmail());
    }

    public static Boolean contieneUsuario(String email){
        for (String mail : usuarios.keySet()){
            if(mail.equals(email)){
                return true;
            }
        }
        return false;
    }

    public static void actualizarUsuario(Usuario u){
        agregarUsuario(u);
    }

    public static Boolean iniciarSesion(String email, String pass){
        if(contieneUsuario(email)){
            if(pass.equals(usuarios.get(email).getPassword())){
                return true;
            }
            return false;
        }
        return false;
    }

    public static Usuario getUsuario(String email) {
        return usuarios.get(email);
    }

    @Override
    public String toString() {
        String s = "";
        for(String user : usuarios.keySet()){
            s += usuarios.get(user).toString();
        }
        return "GestorUsuarios{}";
    }

    public static String mostrar(){
        return usuarios.toString();
    }
}

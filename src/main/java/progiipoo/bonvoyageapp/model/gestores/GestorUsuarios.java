package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

public class GestorUsuarios {
    private static Contenedora<Usuario> usuarios = new Contenedora<>();

    public static void agregarUsuario(Usuario u){
        usuarios.agregarElemento(u);
    }

    public static void eliminarUsuario(Usuario u){
        usuarios.eliminarElemento(u);
    }

    public static Boolean contieneUsuario(Usuario u){
        return contieneUsuario(u);
    }

    public static void actualizarUsuario(Usuario u){
        usuarios.actualizarElemento(u);
    }

    @Override
    public String toString() {
        String s = "";
        for(Usuario u : usuarios){
            s += u.toString();
        }
        return "GestorUsuarios{}";
    }

    public static String mostrar(){
        return usuarios.toString();
    }
}

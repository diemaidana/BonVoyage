package progiipoo.bonvoyageapp.model.gestores;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class OperacionesArchivos {

    public static void guardar(JSONObject json, String nombreArchivo){
        try{
            FileWriter archivo = new FileWriter(nombreArchivo);
            archivo.write(json.toString());
            archivo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static JSONTokener leer(String nombreArchivo){
        JSONTokener token = null;
        try{
            token = new JSONTokener(new FileReader(nombreArchivo));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return token;
    }
}

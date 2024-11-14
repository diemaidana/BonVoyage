package progiipoo.bonvoyageapp.model.gestores;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import progiipoo.bonvoyageapp.model.Contenedora;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

public class GestorJSONElemenViaje {
    private static final String archivo = "elemViaje";

    public static void guardarElemViaje(Contenedora<ElementoViaje> elementos){
        JSONObject json = new JSONObject();
        try{
            JSONArray arreglo = new JSONArray();
            for(ElementoViaje e : elementos){
                arreglo.put(e.toJSON());
            }
            json.put("elementosViaje", arreglo);
        }catch (JSONException e){
            e.printStackTrace();
        }
        OperacionesArchivos.guardar(json, archivo);
    }

    public static Contenedora<ElementoViaje> leerElemViaje(){
        Contenedora<ElementoViaje> elementos = new Contenedora<>();
        try{
            JSONObject json = new JSONObject(OperacionesArchivos.leer(archivo));
            JSONArray arreglo = json.getJSONArray("elementosViaje");
            for(int i = 0; i < arreglo.length(); i++){
                JSONObject obj = arreglo.getJSONObject(i);
                if(obj.has("precio")){
                    if(obj.has("cantDias") && obj.has("ubicacion") && obj.has("puntuacion") && obj.has("desayuno") && obj.has("ciudad") && obj.has("provincia") && obj.has("pais")){
                        Alojamiento a = new Alojamiento(obj);
                        elementos.agregarElemento(a);
                    }
                    if(obj.has("cantDias") && obj.has("destino") && obj.has("tipoAsistencia") && obj.has("asistenciaMedica") && obj.has("medicamentos") && obj.has("perdidaEquipaje") && obj.has("vueloDemorado")){
                        SeguroViaje sv = new SeguroViaje(obj);
                        elementos.agregarElemento(sv);
                    }
                    if(obj.has("ciudadOrigen") && obj.has("provinciaOrigen") && obj.has("paisOrigen") && obj.has("ciudadDestino") && obj.has("provinciaDestino") && obj.has("paisDestino") && obj.has("fechaVuelo")){
                        Vuelo v = new Vuelo(obj);
                        elementos.agregarElemento(v);
                    }
                }
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return elementos;
    }
}

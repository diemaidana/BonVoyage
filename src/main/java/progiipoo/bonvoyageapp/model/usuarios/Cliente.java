package progiipoo.bonvoyageapp.model.usuarios;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import progiipoo.bonvoyageapp.model.viaje.Alojamiento;
import progiipoo.bonvoyageapp.model.viaje.ElementoViaje;
import progiipoo.bonvoyageapp.model.viaje.SeguroViaje;
import progiipoo.bonvoyageapp.model.viaje.Vuelo;

import java.util.ArrayList;

public final class Cliente extends Usuario{
    private String telefono;
    private String domicilio;
    private String ciudad;
    private String provincia;
    private String pais;
    private ArrayList<ElementoViaje> compras;



    public Cliente() {
        super();
        telefono = "";
        domicilio = "";
        ciudad = "";
        provincia = "";
        pais = "";
        compras = new ArrayList<>();
    }

    public Cliente(String email, String password, String dni, String telefono, String domicilio, String ciudad, String provincia, String pais, String nombre, String apellido) {
        super(email, password, dni, nombre, apellido);
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.compras = new ArrayList<>();
    }

    public Cliente(JSONObject json){
        super(json.getString("email"), json.getString("password"), json.getString("dni"), json.getString("nombre"), json.getString("apellido"));
        this.telefono = json.getString("telefono");
        this.domicilio = json.getString("domicilio");
        this.ciudad = json.getString("ciudad");
        this.provincia = json.getString("provincia");
        this.pais = json.getString("pais");
        compras = new ArrayList<>();
        JSONArray arreglo = new JSONArray(json.getJSONArray("compras"));
        if(!arreglo.isEmpty()){
            for (int i = 0; i < arreglo.length(); i++) {
                JSONObject obj = arreglo.getJSONObject(i);
                if(obj.has("ubicacion") && obj.has("puntuacion") && obj.has("desayuno") && obj.has("ciudad") && obj.has("provincia") && obj.has("pais")){
                    Alojamiento a = new Alojamiento(obj);
                    compras.add(a);
                }
                if(obj.has("cantDias") && obj.has("destino") && obj.has("tipoAsistencia") && obj.has("asistenciaMedica") && obj.has("medicamentos") && obj.has("perdidaEquipaje") && obj.has("vueloDemorado")){
                    SeguroViaje sv = new SeguroViaje(obj);
                    compras.add(sv);
                }
                if(obj.has("ciudadOrigen") && obj.has("provinciaOrigen") && obj.has("paisOrigen") && obj.has("ciudadDestino") && obj.has("provinciaDestino") && obj.has("paisDestino") && obj.has("fechaVuelo")){
                    Vuelo v = new Vuelo(obj);
                    compras.add(v);
                }
            }
        }
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

    public void agregarElemViaje(ElementoViaje e){
        this.compras.add(e);
    }

    public ArrayList<ElementoViaje> getCompras() {
        return compras;
    }

    public JSONObject toJSON(){
        JSONObject json = super.toJSON();
        try{
            json.put("telefono", telefono);
            json.put("domicilio", domicilio);
            json.put("ciudad", ciudad);
            json.put("provincia", provincia);
            json.put("pais", pais);
            JSONArray arreglo = new JSONArray();
            for(ElementoViaje e : compras){
                arreglo.put(e.toJSON());
            }
            json.put("compras", arreglo);
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

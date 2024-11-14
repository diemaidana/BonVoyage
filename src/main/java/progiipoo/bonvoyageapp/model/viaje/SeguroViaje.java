package progiipoo.bonvoyageapp.model.viaje;

import org.json.JSONException;
import org.json.JSONObject;

public final class SeguroViaje extends ElementoViaje {
    private int cantDias;
    private String destino;
    private String tipoAsistencia;
    private String asistenciaMedica;
    private String medicamentos;
    private String perdidaEquipaje;
    private String vueloDemorado;

    // CONSTRUCTOR
    public SeguroViaje() {
        super();
        this.destino = null;
        this.cantDias = 0;
        this.tipoAsistencia = null;
        this.asistenciaMedica = null;
        this.medicamentos = null;
        this.perdidaEquipaje = null;
        this.vueloDemorado = null;
    }

    public SeguroViaje(Double precio, int cantDias, String destino, String tipoAsistencia,
                       String asistenciaMedica, String medicamentos, String perdidaEquipaje, String vueloDemorado) {
        super(precio);
        this.cantDias = cantDias;
        this.destino = destino;
        this.tipoAsistencia = tipoAsistencia;
        this.asistenciaMedica = asistenciaMedica;
        this.medicamentos = medicamentos;
        this.perdidaEquipaje = perdidaEquipaje;
        this.vueloDemorado = vueloDemorado;
    }

    public SeguroViaje(JSONObject obj) {
        super(obj.getDouble("precio"));
        this.cantDias = obj.getInt("cantDias");
        this.destino = obj.getString("destino");
        this.tipoAsistencia = obj.getString("tipoAsistencia");
        this.asistenciaMedica = obj.getString("asistenciaMedica");
        this.medicamentos = obj.getString("medicamentos");
        this.perdidaEquipaje = obj.getString("perdidaEquipaje");
        this.vueloDemorado = obj.getString("vueloDemorado");
    }

    //GET Y SET

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public String getAsistenciaMedica() {
        return asistenciaMedica;
    }

    public void setAsistenciaMedica(String asistenciaMedica) {
        this.asistenciaMedica = asistenciaMedica;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getPerdidaEquipaje() {
        return perdidaEquipaje;
    }

    public void setPerdidaEquipaje(String perdidaEquipaje) {
        this.perdidaEquipaje = perdidaEquipaje;
    }

    public String getVueloDemorado() {
        return vueloDemorado;
    }

    public void setVueloDemorado(String vueloDemorado) {
        this.vueloDemorado = vueloDemorado;
    }

    public JSONObject toJSON(){
        JSONObject json = super.toJSON();
        try{
            json.put("cantDias", cantDias);
            json.put("destino", destino);
            json.put("tipoAsistencia", tipoAsistencia);
            json.put("asistenciaMedica", asistenciaMedica);
            json.put("medicamentos", medicamentos);
            json.put("perdidaEquipaje", perdidaEquipaje);
            json.put("vueloDemorado", vueloDemorado);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return json;
    }



}

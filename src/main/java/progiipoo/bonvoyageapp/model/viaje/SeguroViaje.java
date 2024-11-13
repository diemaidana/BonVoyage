package progiipoo.bonvoyageapp.model.viaje;

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



}

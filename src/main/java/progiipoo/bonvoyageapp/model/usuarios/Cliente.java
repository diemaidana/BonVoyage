package progiipoo.bonvoyageapp.model.usuarios;

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

    public Cliente(String email, String password, String dni, String telefono, String domicilio, String ciudad, String provincia, String pais) {
        super(email, password, dni);
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
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

    @Override
    public Boolean puedeCargar() {
        return false;
    }


}

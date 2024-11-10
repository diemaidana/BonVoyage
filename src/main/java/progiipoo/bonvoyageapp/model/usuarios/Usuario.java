package progiipoo.bonvoyageapp.model.usuarios;

import java.util.Objects;

public abstract class Usuario {
     private String email;
     private String dni;
     private String password;
     private String telefono;
     private String domicilio;
     private String ciudad;
     private String provincia;
     private String pais;

    public Usuario() {
        email = "";
        password = "";
        dni = "";
        telefono = "";
        domicilio = "";
        ciudad = "";
        provincia = "";
        pais = "";
    }

    public Usuario(String email, String password, String dni, String telefono, String domicilio, String ciudad,
                   String provincia, String pais) {
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
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

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return pais;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(dni, usuario.dni) && Objects.equals(password, usuario.password) && Objects.equals(telefono, usuario.telefono) && Objects.equals(domicilio, usuario.domicilio) && Objects.equals(ciudad, usuario.ciudad) && Objects.equals(provincia, usuario.provincia) && Objects.equals(pais, usuario.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, dni, password, telefono, domicilio, ciudad, provincia, pais);
    }
}

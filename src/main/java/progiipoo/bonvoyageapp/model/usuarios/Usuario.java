package progiipoo.bonvoyageapp.model.usuarios;

import progiipoo.bonvoyageapp.model.interfaces.IpuedeCargar;

import java.util.Iterator;
import java.util.Objects;

public abstract class Usuario implements IpuedeCargar {
     private String email;
     private String dni;
     private String password;


    public Usuario() {
        email = "";
        password = "";
        dni = "";
    }

    public Usuario(String email, String password, String dni) {
        this.email = email;
        this.password = password;
        this.dni = dni;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, dni);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public abstract Boolean puedeCargar();
}

package progiipoo.bonvoyageapp.model.usuarios;

public final class Administrador extends Usuario {

    @Override
    public Boolean puedeCargar() {
        return true;
    }
}

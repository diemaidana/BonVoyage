package progiipoo.bonvoyageapp.model.usuarios;

import java.util.ArrayList;

public final class Cliente extends Usuario{

    public Cliente() {
        super();
    }

    public Cliente(String email, String password, String dni, String telefono, String domicilio, String ciudad,
                   String provincia, String pais) {
        super(email, password, dni, telefono, domicilio, ciudad, provincia, pais);
    }
}

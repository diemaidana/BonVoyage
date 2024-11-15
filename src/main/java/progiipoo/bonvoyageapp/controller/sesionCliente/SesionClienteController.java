package progiipoo.bonvoyageapp.controller.sesionCliente;

import progiipoo.bonvoyageapp.model.usuarios.Cliente;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

public class SesionClienteController {
    protected Cliente usuario;

    public SesionClienteController() {
        usuario = null;
    }

    public SesionClienteController(Cliente usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
}

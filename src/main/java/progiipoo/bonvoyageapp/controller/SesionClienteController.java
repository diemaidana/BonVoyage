package progiipoo.bonvoyageapp.controller;

import progiipoo.bonvoyageapp.model.usuarios.Usuario;

public class SesionClienteController {
    protected Usuario usuario;

    public SesionClienteController() {
        usuario = null;
    }

    public SesionClienteController(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

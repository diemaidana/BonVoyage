package progiipoo.bonvoyageapp.model.gestores;

import progiipoo.bonvoyageapp.model.viaje.Alojamiento;

public class GestoraViaje {
    public static void crearAlojamiento() {
        Alojamiento alojamiento = new Alojamiento();

        alojamiento.setCantDias();
        alojamiento.setCiudad();
        alojamiento.setProvincia();
        alojamiento.setPais();
        alojamiento.setPrecio();
        alojamiento.setUbicacion();
    }
}

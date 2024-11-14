package progiipoo.bonvoyageapp.model.MetodosDePago;

public final class TarjetaCredito {
    private String numeroTarjeta;
    private String nombreTitular;
    private String fechaExpiracion;
    private String codigoSeguridad;

    // Constructor
    public TarjetaCredito(String numeroTarjeta, String nombreTitular, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }


    private boolean procesarPago(double monto) {
        if (esValida()) {
            System.out.println("Procesando pago de " + monto + " con tarjeta de crédito " + numeroTarjeta);
            return true;
        } else {
            System.out.println("Error: La tarjeta de crédito no es válida.");
            return false;
        }
    }

    // Metodo para validar la tarjeta segun Luhn
    public boolean esValida() {
        String numero = numeroTarjeta.replaceAll("\\s+", "");

        if (numero.length() !=16) {
            System.out.println("Número de tarjeta no válido");
            return false;
        }

        int suma = 0;
        boolean esPar = false;

        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numero.charAt(i));

            if (esPar) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }

            suma += digito;
            esPar = !esPar;
        }

        return suma % 10 == 0;
    }
}

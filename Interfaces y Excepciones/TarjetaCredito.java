public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de crédito: " + numeroTarjeta);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return 1 - (porcentaje / 100.0);
    }
}
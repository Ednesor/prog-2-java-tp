//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");

        // Crear productos
        Producto p1 = new Producto("Laptop", 1200.0);
        Producto p2 = new Producto("Mouse", 25.0);

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Procesar pago con Tarjeta de Crédito con descuento
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        double descuento = tarjeta.aplicarDescuento(10); // 10% de descuento
        double totalConDescuento = total * descuento;
        tarjeta.procesarPago(totalConDescuento);

        // Cambiar estado del pedido y notificar al cliente
        pedido.cambiarEstado("Enviado");
    }
}
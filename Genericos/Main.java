import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Producto<?>> productos = new ArrayList<>();
        productos.add(new Producto<String>("SKU123", "Teclado", 1200.0));
        productos.add(new Producto<Integer>(456, "Mouse", 450.0));
        productos.add(new Producto<String>("SKU789", "Monitor", 5500.0));

        for (Producto<?> p : productos) {
            System.out.println(p);
        }

        Carrito<Producto<?>> carrito = new Carrito<>();

        carrito.agregarProducto(new Producto<String>("SKU001", "Libro", 300.0));
        carrito.agregarProducto(new Producto<Integer>(101, "Cuaderno", 150.0));

        carrito.mostrarProductos();

        System.out.println("Total: " + carrito.obtenerTotal());

        Pedido p1 = new Pedido(1, LocalDate.of(2023, 6, 1));
        p1.agregarProducto(new Producto<>("SKU1", "Lapicera", 50));
        p1.agregarProducto(new Producto<>("SKU2", "Cuaderno", 200));

        Pedido p2 = new Pedido(2, LocalDate.of(2023, 5, 20));
        p2.agregarProducto(new Producto<>("SKU3", "Libro", 300));

        List<Pedido> pedidos = Arrays.asList(p1, p2);

        // Ordenar por total (Comparable)
        Collections.sort(pedidos);
        System.out.println("Pedidos ordenados por total:");
        pedidos.forEach(System.out::println);

        // Ordenar por fecha (Comparator)
        pedidos.sort(new ComparadorPedidosPorFecha());
        System.out.println("Pedidos ordenados por fecha:");
        pedidos.forEach(System.out::println);

        Pedido p3 = new Pedido(1);
        Pedido p4 = new Pedido(2);

        List<Pedido> pedidos1 = Arrays.asList(p1, p2);

        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido resultado = buscador.buscar(pedidos, 2);

        if (resultado != null) {
            System.out.println("Pedido encontrado: " + resultado);
        } else {
            System.out.println("Pedido no encontrado");
        }
    }
}
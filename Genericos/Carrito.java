import java.util.*;

public class Carrito<T extends Producto<?>> {
    private List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    public double obtenerTotal() {
        double total = 0;
        for (T producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (T producto : productos) {
            System.out.println(producto);
        }
    }
}

import java.time.LocalDate;
import java.util.*;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private int id;
    private List<Producto<?>> productos = new ArrayList<>();
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    public Pedido(int id) {
        this.id = id;
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto<?> p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", total=" + calcularTotal() +
                '}';
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getID() {
        return id;
    }

    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }
}
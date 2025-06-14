import java.util.Comparator;

class ComparadorPedidosPorFecha implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }
}
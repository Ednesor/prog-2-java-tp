import java.util.ArrayList;
import java.util.List;

public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = new ArrayList<>(productos);
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Se agregó un producto");
    }

    public void listarProductos() {
        System.out.println("----------Lista de productos----------");
        for(Producto producto: this.productos){
            System.out.println(producto);
        }
        System.out.println("--------------------------------------");
    }

    public void listarProductos(List<Producto> productos){
        if(productos.isEmpty()) {
            System.out.println("No hay productos para listar");
            return;
        }
        System.out.println("----------Lista de productos----------");
        for(Producto producto: productos){
            System.out.println(producto);
        }
        System.out.println("--------------------------------------");
    }

    public Producto buscarProductoPorId(String id){
        for(Producto producto: this.productos){
            if(producto.getId().equals(id)) return producto;
        }
        return null;
    }

    public void eliminarProducto(String id){
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getId().equals(id)) {
                this.productos.remove(i);
                System.out.println("Producto eliminado");
                return;
            }
        }
    }

    public void actualizarStock(String id, int nuevaCantidad){
        for (Producto producto: this.productos){
            if(producto.getId().equals(id)) {
                producto.setCantidad(nuevaCantidad);
                return;
            }
        }
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        List<Producto> productos = new ArrayList<>();

        for(Producto producto: this.productos){
            if(producto.getCategoria().equals(categoria)) productos.add(producto);
        }

        return productos;
    }


}

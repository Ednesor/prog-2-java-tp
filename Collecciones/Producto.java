public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto() {
    }

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void mostrarInfo(){
        System.out.println("----------Producto----------");
        System.out.println("Id: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("----------Producto----------");
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}

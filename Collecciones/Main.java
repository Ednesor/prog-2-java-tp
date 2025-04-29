//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto fideos1 = new Producto("f1", "Fideos Mostacholes", 20.4, 5, CategoriaProducto.ALIMENTOS);
        Producto celular1 = new Producto("c1", "IPhone X PRO MAX TURBO", 198198198.2, 2, CategoriaProducto.ELECTRONICA);
        Producto celular2 = new Producto("c2", "IPhone X PRO MAX NORMAL", 8198.2, 34, CategoriaProducto.ELECTRONICA);
        Producto pantalones1 = new Producto("p1", "Pantalones de campana", 151.23, 7, CategoriaProducto.ROPA);
        Producto mueble1 = new Producto("m1", "Ropero", 1381.4, 1, CategoriaProducto.HOGAR);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(fideos1);
        inventario.agregarProducto(celular1);
        inventario.agregarProducto(pantalones1);
        inventario.agregarProducto(mueble1);
        inventario.agregarProducto(celular2);

        System.out.println(inventario.buscarProductoPorId("f1"));

        inventario.listarProductos(inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));

        inventario.eliminarProducto("c2");

        inventario.listarProductos();
    }
}
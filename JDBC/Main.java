import model.Categoria;
import service.CategoriaServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoriaServiceImpl service = new CategoriaServiceImpl();

        try {
            System.out.println("Creando categoría...");
            Categoria cat1 = new Categoria("Electrónica", "Productos electrónicos");
            service.crear(cat1);

            System.out.println("Listado de categorías:");
            List<Categoria> categorias = service.listar();
            for (Categoria c : categorias) {
                System.out.println(c);
            }

            System.out.println("Actualizando categoría...");
            Categoria catUpdate = categorias.get(0);
            catUpdate.setDescripcion("Productos electrónicos y gadgets");
            service.actualizar(catUpdate);

            System.out.println("Mostrando categoría actualizada:");
            Categoria cLeida = service.leer(catUpdate.getId());
            System.out.println(cLeida);

            System.out.println("Eliminando categoría...");
            service.eliminar(catUpdate.getId());

            System.out.println("Listado después de eliminar:");
            categorias = service.listar();
            for (Categoria c : categorias) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

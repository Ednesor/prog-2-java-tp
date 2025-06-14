package service;

import dao.CategoriaDAO;
import dao.CategoriaDAOImpl;
import model.Categoria;

import java.util.List;

public class CategoriaServiceImpl implements GenericService<Categoria> {

    private CategoriaDAO categoriaDAO = new CategoriaDAOImpl();

    @Override
    public boolean crear(Categoria c) throws Exception {
        if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío.");
        }
        if (categoriaDAO.existeNombre(c.getNombre())) {
            throw new IllegalArgumentException("Ya existe una categoría con ese nombre.");
        }
        return categoriaDAO.crear(c);
    }

    @Override
    public Categoria leer(int id) throws Exception {
        return categoriaDAO.leer(id);
    }

    @Override
    public boolean actualizar(Categoria c) throws Exception {
        if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío.");
        }
        // Podrías agregar validación para no duplicar nombres aquí también
        return categoriaDAO.actualizar(c);
    }

    @Override
    public boolean eliminar(int id) throws Exception {
        return categoriaDAO.eliminar(id);
    }

    @Override
    public List<Categoria> listar() throws Exception {
        return categoriaDAO.listar();
    }
}

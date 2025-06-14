package dao;

public interface CategoriaDAO extends dao.GenericDAO<model.Categoria> {
    boolean existeNombre(String nombre) throws Exception;
}

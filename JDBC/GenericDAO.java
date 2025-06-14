package dao;

import java.util.List;

public interface GenericDAO<T> {
    boolean crear(T t) throws Exception;
    T leer(int id) throws Exception;
    boolean actualizar(T t) throws Exception;
    boolean eliminar(int id) throws Exception;
    List<T> listar() throws Exception;
}
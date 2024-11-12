package Interfaces;

import java.util.List;

public interface ICRUD <T>{
    public boolean agregar(T entity);
    public boolean modificar(T entity);
    public T leer(int id);
    public List<T> listar();
}

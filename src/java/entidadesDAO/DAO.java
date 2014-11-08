/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadesDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz DAO
 * @author Victor Rivarola
 * @param <T>
 */

public interface DAO<T> {

    /**
     * Metodo para insertar un objeto en la base de datos
     * @param dato informacion que se desea insertar
     * @return 
     */
    public boolean insertar(T dato);
    /**
     * Metodo para editar un objeto en la base de datos
     * @param dato informacion que se desea editar
     */
    public void editar(T dato);
    /**
     * Metodo para eliminar un objeto de la base de datos
     * @param id identificador del objeto que se desea eliminar
     * @return 
     */
    public boolean eliminar(Integer id);
    /**
     * Metodo que busca un dato por su identificador
     * @param id identificador del objeto
     * @return objeto que se busco en la base de datos
     */
    public T buscarPorID(Integer id);
    /**
     * Metodo que compara una cadena con la base de datos para encontrar un objeto
     * @param dato la cadena que se va a comparar
     * @return lista de las considencias
     */
    public ArrayList<T> buscar(String dato);
    
    public List<T> list();
}

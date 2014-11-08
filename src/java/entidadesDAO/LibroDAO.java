/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesDAO;

import entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import utildb.DBUtil;

/**
 *
 * @author Victor Rivarola
 */
public class LibroDAO implements DAO<Libro> {

    private Session st = DBUtil.getSessionFactory().openSession();

    @Override
    public boolean insertar(Libro dato) {
        try {
            st.beginTransaction();
            st.save(dato);
            st.getTransaction().commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
            return false;
        } finally {
            st.close();
        }
    }

    @Override
    public void editar(Libro dato) {
        try {
            st.beginTransaction();
            st.update(dato);
            st.getTransaction().commit();

        } catch (Exception e) {

        } finally {
            st.close();
        }
    }

    @Override
    public boolean eliminar(Integer id) {
        try {
            st.beginTransaction();
            st.delete(buscarPorID(id));
            st.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            st.close();
        }
        

    }

    @Override
    public Libro buscarPorID(Integer id) {
        Libro au = null;
        try {
            st.beginTransaction();
            au = (Libro) st.load(Libro.class, id);
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public ArrayList<Libro> buscar(String dato) {
        ArrayList<Libro> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Libro l where l. tituloLibro= '" + dato+"'").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public List<Libro> list() {
        ArrayList<Libro> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Libro").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

   

}

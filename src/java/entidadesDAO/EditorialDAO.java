/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadesDAO;

import entidades.Editorial;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import utildb.DBUtil;

/**
 *
 * @author Victor Rivarola
 */
public class EditorialDAO implements DAO<Editorial>{
private Session st= DBUtil.getSessionFactory().openSession();
    
    @Override
    public boolean insertar(Editorial dato) {
        try {
            st.beginTransaction();
            st.save(dato);
            st.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
        } finally {
            st.close();
        }
    return dato!=null;
    }

    @Override
    public void editar(Editorial dato) {
        try {
            st.beginTransaction();
            st.update(dato);
            st.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo Actualizar");
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
        } catch (Exception e) {
        } finally {
            st.close();
        }
    return false;

    }

    @Override
    public Editorial buscarPorID(Integer id) {
        Editorial au = null;
        try {
            st.beginTransaction();
            au = (Editorial) st.load(Editorial.class, id);
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public ArrayList<Editorial> buscar(String dato) {
        ArrayList<Editorial> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Editorial a where a. descriEditorial= '" + dato+"'").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public List<Editorial> list() {
        ArrayList<Editorial> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Editorial").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

}

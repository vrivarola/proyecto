/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesDAO;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import static org.hibernate.annotations.common.util.StringHelper.toLowerCase;
import utildb.DBUtil;

/**
 *
 * @author Victor Rivarola
 */
public class UsuarioDAO implements DAO<Usuario> {

    private Session st = DBUtil.getSessionFactory().openSession();

    @Override
    public boolean insertar(Usuario dato) {
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
    public void editar(Usuario dato) {
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
    public Usuario buscarPorID(Integer id) {
        Usuario au = null;
        try {
            st.beginTransaction();
            au = (Usuario) st.load(Usuario.class, id);
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public ArrayList<Usuario> buscar(String dato) {
        ArrayList<Usuario> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Usuario a WHERE lower(a. descripArt) LIKE '%" + toLowerCase(dato) + "%' or  lower(a. apellidoUsu) LIKE '%" + toLowerCase(dato) + "%'").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public List<Usuario> list() {
        ArrayList<Usuario> au=null;
        try {
            st.getTransaction();
            au = (ArrayList) st.createQuery("FROM Usuario").list();
        } catch (Exception e) {

        } finally {
            st.close();
        }
        return au;
    }

   

}

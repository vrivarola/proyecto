/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesDAO;

import entidades.Pais;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import utildb.DBUtil;

/**
 *
 * @author Victor Rivarola
 */
public class PaisDAO implements DAO<Pais> {

    private Session st = DBUtil.getSessionFactory().openSession();
    private Session session;
    private String mess;

    public PaisDAO() {
        session = DBUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean insertar(Pais dato) {
        try {
            st.beginTransaction();
            st.save(dato);
            st.getTransaction().commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "No se pudo guardar");
            return false;
        } finally {
            st.close();
        }
    }

    @Override
    public void editar(Pais dato) {
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
        Pais pais = buscarPorID(id);
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().openSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            session.delete(pais);
            tx.commit();
        } catch (HibernateException e) {
            mess = e.getMessage();
            tx.rollback();
            return false;
        }
        return true;
    }

    @Override
    public Pais buscarPorID(Integer id) {
        Pais Pais = null;
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Pais as pais where pais.idPais=" + id);
            Pais = (Pais) q.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            mess = e.getMessage();
            tx.rollback();
        }
        return Pais;
    }

    @Override
    public ArrayList<Pais> buscar(String dato) {
        ArrayList<Pais> au = null;
        try {
            st.getTransaction();
            au = (ArrayList<Pais>) st.createQuery("FROM Pais p where p. descriPais= '" + dato + "'").list();
        } catch (Exception e) {
        } finally {
            st.close();
        }
        return au;
    }

    @Override
    public List<Pais> list() {
        List<Pais> au = null;
        try {
            st.getTransaction();
            au = (ArrayList<Pais>) st.createQuery("from Pais").list();
            return au;
        } catch (Exception e) {
        }
        return au;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesDAO;

import entidades.Autor;
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
public class AutorDAO implements DAO<Autor> {
    private Session st = DBUtil.getSessionFactory().openSession();
    private Session session;
    private String mess;

    public AutorDAO() {
        session = DBUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean insertar(Autor dato) {
        try {
            st.beginTransaction();
            st.save(dato);
            st.getTransaction().commit();
            return true;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "No se pudo guardar");
            return false;
        }finally {
            st.close();
        }
    }

    @Override
    public void editar(Autor dato) {
        try {
            st.beginTransaction();
            st.update(dato);
            st.getTransaction().commit();
        } catch (Exception e) {
            st.close();
        }
    }

    @Override
    public boolean eliminar(Integer id) {
        Autor autor = buscarPorID(id);
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }

        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            session.delete(autor);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
            return false;
        }
        return true;
    }

    @Override
    public Autor buscarPorID(Integer id) {
        Autor autor = null;
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Autor as autor where autor.idAutor=" + id);
            autor = (Autor) q.uniqueResult();
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }

        return autor;
    }

    @Override
    public ArrayList<Autor> buscar(String dato) {
        ArrayList<Autor> autorList = null;
        try{
            st.getTransaction();
            autorList = (ArrayList<Autor>) st.createQuery("FROM Autor autor where autor. descriAutor='" + dato +"'").list();
        } catch (Exception e) {
            
        }finally {
            st.close();
        }
        return autorList;
//        if (!session.isOpen()) {
//            this.session = DBUtil.getSessionFactory().getCurrentSession();
//        }
//        org.hibernate.Transaction tx = session.beginTransaction();
//        try {
//            Query q = session.createQuery("from Autor autor where lower(autor.descriAutor) like '%" + toLowerCase(dato) + "%'");
//            autorList = (ArrayList<Autor>) q.list();
//            tx.commit();
//        } catch (HibernateException ex) {
//            mess = ex.getMessage();
//            tx.rollback();
//        }
    }

    @Override
    public List<Autor> list() {
        List<Autor> autorList = null;
        try {
            st.getTransaction();
            autorList = (ArrayList<Autor>) st.createQuery("from Autor").list();
            return autorList;
        } catch (Exception e){
            
        }
        
//        if (!session.isOpen()) {
//            this.session = DBUtil.getSessionFactory().getCurrentSession();
//        }
//        org.hibernate.Transaction tx = session.beginTransaction();
//        try {
//            Query q = session.createQuery("from Autor autor order by autor.idAutor");
//            autorList = (List<Autor>) q.list();
//            tx.commit();
//        } catch (HibernateException ex) {
//            mess = ex.getMessage();
//            tx.rollback();
//        }
        return autorList;
    }

    public List<Autor> list(int pageSize, int page) {
        List<Autor> autorList = null;
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Autor autor order by autor. idAutor");
            autorList = (List<Autor>) q.list().subList(page * pageSize, (page + 1) * pageSize);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }
        return autorList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesDAO;

import entidades.Ciudad;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import static org.hibernate.annotations.common.util.StringHelper.toLowerCase;
import utildb.DBUtil;

/**
 *
 * @author Victor Rivarola
 */
public class CiudadDAO implements DAO<Ciudad> {

    private Session session;
    private String mess;

    public CiudadDAO() {
        session = DBUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean insertar(Ciudad dato) {
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }

        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            session.saveOrUpdate(dato);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
            return false;
        }
        return true;
    }

    @Override
    public void editar(Ciudad dato) {
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }

        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            session.saveOrUpdate(dato);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
            //return false;
        }
        //return true;
    }

    @Override
    public boolean eliminar(Integer id) {
        Ciudad ciudad = buscarPorID(id);
        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }

        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            session.delete(ciudad);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
            return false;
        }
        return true;
    }

    @Override
    public Ciudad buscarPorID(Integer id) {
        Ciudad Ciudad = null;

        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Ciudad as ciudad where ciudad. idCiudad=" + id);
            Ciudad = (Ciudad) q.uniqueResult();
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }

        return Ciudad;
    }

    @Override
    public ArrayList<Ciudad> buscar(String dato) {
        ArrayList<Ciudad> ciudadList = null;

        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Ciudad ciudad where lower(ciudad. descriCiudad) like '%" + toLowerCase(dato) + "%'");
            ciudadList = (ArrayList<Ciudad>) q.list();
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }
        return ciudadList;
    }

    @Override
    public List<Ciudad> list() {
        List<Ciudad> ciudadList = null;

        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Ciudad ciudad order by ciudad. idCiudad");
            ciudadList = (List<Ciudad>) q.list();
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }
        return ciudadList;
    }

    public List<Ciudad> list(int pageSize, int page) {
        List<Ciudad> ciudadList = null;

        if (!session.isOpen()) {
            this.session = DBUtil.getSessionFactory().getCurrentSession();
        }
        org.hibernate.Transaction tx = session.beginTransaction();
        try {
            Query q = session.createQuery("from Ciudad ciudad order by ciudad. idCiudad");
            ciudadList = (List<Ciudad>) q.list().subList(page * pageSize, (page + 1) * pageSize);
            tx.commit();
        } catch (HibernateException ex) {
            mess = ex.getMessage();
            tx.rollback();
        }
        return ciudadList;
    }
}
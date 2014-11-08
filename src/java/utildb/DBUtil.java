package utildb;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




/**
 * Clase DBUtil
 * @author Victor Rivarola
 */
public class DBUtil
{
    private static SessionFactory sessionFactory;
    private static final ServiceRegistry serviceRegistry;
    
    static
    {
        try
        {
            Configuration configuration = new Configuration().configure("utildb/hibernate.cfg.xml");

            serviceRegistry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }
/**
 * Metodo que obtiene la conexion con la base de datos
 * @return conexion con la base de datos
 */
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    } 
}

package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public interface ListeLivres {
 

    public static List<Livre> afficher() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Livre> result = session.createQuery("from Livre").list();
        session.getTransaction().commit();
        session.close();

        return result;
    }

}

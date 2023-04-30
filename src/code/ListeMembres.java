package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public interface ListeMembres {
 
    public static List<Membre> afficher() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Membre> result = session.createQuery("from Membre").list();
        session.getTransaction().commit();
        session.close();

        return result;
    }

}

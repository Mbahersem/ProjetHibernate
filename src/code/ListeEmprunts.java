package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public interface ListeEmprunts {

    public static List<Emprunt> afficher() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Emprunt> result = session.createQuery("from Emprunt").list();
        session.getTransaction().commit();
        session.close();

        return result;

    }
}

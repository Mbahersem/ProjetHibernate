package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Admin {
    
    public static boolean verifier(String identifiant, String motDePasse) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Gestionnaire> result = session.createQuery("from Gestionnaire " +
                                                        "where idGestionnaire = " + identifiant + "and motDePasse = " + motDePasse).list();
        session.getTransaction().commit();
        session.close();

        return !result.isEmpty();

    }

}

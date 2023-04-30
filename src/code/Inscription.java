package code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Inscription {
    
    public default void ouverture() {
        
    }

    public default boolean enregistrer(String nom, String prenom, String numeroTelephone, String numeroCNI) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Membre(nom, prenom, numeroTelephone, numeroCNI));
        session.getTransaction().commit();
        session.close();
        
        return true;
    }

    public default void reset(){

    }
    
}

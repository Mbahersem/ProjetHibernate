package code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Importation {
    
    public default void ouverture() {
        
    }

    public static boolean enregistrer(String titre, String auteur, int nombreExemplaires) {
        
        Session session = Login.sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Livre(titre, auteur, nombreExemplaires));
        session.getTransaction().commit();
        session.close();

        
        return true;
    }

    public default void reset(){

    }
  
}

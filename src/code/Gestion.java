package code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public interface Gestion {

    public default boolean enregistrer(String identifiant, String motDePasse) {
        
        Session session = Login.sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Gestionnaire(identifiant, motDePasse));
        session.getTransaction().commit();
        session.close();
        
        return true;
    }
    
    public default void saisieID() {
        
    }

    public default void saisieMotDePasse() {
        
    }

    public default void saisie(){

    }

    public default void ouvrirConnexion() {
        
    }

    public default void ouvrirInscription() {
        
    }

    public default void ouvrirListeMembres() {
        
    }

    public default void ouvrirListeLivres() {
        
    }
}

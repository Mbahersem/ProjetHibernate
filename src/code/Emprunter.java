package code;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Emprunter {
    
        //Save 
    public static boolean enregistrer(Date dateEmprunt, Date dateRendu, Livre livre, Membre membre) {
        

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Emprunt(dateEmprunt, dateRendu, livre, membre));
        session.getTransaction().commit();
        session.close();
           
        return true;
   
    }
}

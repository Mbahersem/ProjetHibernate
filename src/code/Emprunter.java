package code;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Emprunter {
    
    public static boolean emprunter(int idLivre, int idMembre) {
        
        Session session = Login.sessionFactory.openSession();
        session.beginTransaction();
        List<Livre> result1 = session.createQuery("from Livre " +
                                                        "where idLivre = " + idLivre).list();
        List<Membre> result2 = session.createQuery("from Membre " +
                                                        "where id = " + idMembre).list();        
        session.getTransaction().commit();
        session.close();

        for (Membre membre : result2) {
            for (Livre livre : result1) {
                
                return enregistrer(livre, membre);

            }
        }

        return false;
    }

    //Save 
    public static boolean enregistrer(Livre livre, Membre membre) {
        

        Session session = Login.sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Emprunt(livre, membre));
        session.getTransaction().commit();
        session.close();

        livre.setNombreExemplaires(livre.getNombreExemplaires() - 1);
           
        return true;
   
    }
}

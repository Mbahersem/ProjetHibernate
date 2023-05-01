package code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public interface Inscription {
    
    // public void ouverture() {
        
    // }

    public void enregistrer(String nom, String prenom, String numeroTelephone, String numeroCNI) {
        
    }

    // public void reset(){

    // }
    
}

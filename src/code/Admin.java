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
        
        String name = "MH";
        String pass = "123456";
        
        if(identifiant.equals(name) && motDePasse.equals(pass)) {
        	return true;
        }
        
        return false;

    }

}

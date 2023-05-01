package code;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application implements Inscription{
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Connexion");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static SessionFactory sessionFactory;
    
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.addAnnotatedClass(code.Membre.class);
        config.addAnnotatedClass(code.Livre.class);
        config.addAnnotatedClass(code.Emprunt.class);
        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "");


        launch(args);
    }

    public void enregistrer(String nom, String prenom, String numeroTelephone, String numeroCNI) {
        Session session = sessionFactory.openSession();
    	session.beginTransaction();
        session.save(new code.Membre(nom, prenom, numeroTelephone, numeroCNI));
        session.getTransaction().commit();
        session.close();
        
    }

}

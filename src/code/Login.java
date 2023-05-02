package code;
import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(new File("src/Login.fxml").toURI().toURL());
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

        sessionFactory = config.buildSessionFactory();

        launch(args);
    }


}

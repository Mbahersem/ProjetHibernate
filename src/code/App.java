package code;

import java.io.File;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Stage{

    public App() {
        try {
            Parent root = FXMLLoader.load(new File("App.fxml").toURI().toURL());
            Scene scene = new Scene(root);

            setTitle("Application");
            setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

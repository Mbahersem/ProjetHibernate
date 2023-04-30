
import code.App;
import code.Connexion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LogController {
    @FXML
    private TextField tfId;
    @FXML
    private PasswordField tfMdp;
    
    @FXML
    public void connecter(ActionEvent event) {

        String identifiant = tfId.getText();
        String motDePasse = String.valueOf(tfMdp.getPassword());

        if (Connexion.connecter(identifiant,motDePasse)) {
            
            App application = new App();
            application.show();
            
        }
    }
}

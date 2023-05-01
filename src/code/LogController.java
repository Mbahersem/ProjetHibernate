package code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LogController {
    @FXML
    private Label lblStatutCon;

    @FXML
    private TextField tfId;

    @FXML
    private PasswordField tfMdp;
    
    @FXML
    public void connecter(ActionEvent event) {

        String identifiant = tfId.getText();
        String motDePasse = String.valueOf(tfMdp.getText());

        if (Connexion.connecter(identifiant,motDePasse)) {
            tfId.setText("");
            tfMdp.setText("");
            lblStatutCon.setText("Connexion réussie !");
            App application = new App();
            application.show(); 
        }
        else {
        	lblStatutCon.setText("Identifiant ou mot de passe erroné, veuillez réessayer...");
        }
    }
}



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
        System.out.println(tfId.getText());
    }
}

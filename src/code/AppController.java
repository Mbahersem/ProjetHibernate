package code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AppController {

    @FXML
    private Button btEnregistrerMembre;

    @FXML
    private Button btOngInsc;

    @FXML
    private Button butOngEmp;

    @FXML
    private Button butOngInv;

    @FXML
    private Button butOngMem;

    @FXML
    private Label lblHead;

    @FXML
    private Pane pnEmprunt;

    @FXML
    private Pane pnInsc;

    @FXML
    private Pane pnInv;

    @FXML
    private Pane pnMem;

    @FXML
    private TableView<?> tabEmp;

    @FXML
    private TableView<?> tabInv;

    @FXML
    private TableView<?> tabMem;

    @FXML
    private Label tfCNI;

    @FXML
    private Label tfNom;

    @FXML
    private Label tfPrenom;

    @FXML
    private Label tfTel;

    @FXML
    void ongletEmprunts(MouseEvent event) {
    	pnEmprunt.toFront();
    }

    @FXML
    void ongletInsc(MouseEvent event) {
    	pnInsc.toFront();
    }

    @FXML
    void ongletInventaire(MouseEvent event) {
    	pnInv.toFront();
    }

    @FXML
    void ongletMembres(MouseEvent event) {
    	pnMem.toFront();
    }

}
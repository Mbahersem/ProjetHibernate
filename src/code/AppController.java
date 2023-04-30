
package code;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
        lblHead.setText("Emprunt");
    }

    @FXML
    void ongletInsc(MouseEvent event) {
    	pnInsc.toFront();
        lblHead.setText("Inscription");
    }

    @FXML
    void ongletInventaire(MouseEvent event) {
    	pnInv.toFront();
        lblHead.setText("Inventaire");
    }

    @FXML
    void ongletMembres(MouseEvent event) {
    	pnMem.toFront();
        lblHead.setText("Membres");
    }
    
    @FXML
    void enregistrer(MouseEvent event) {

    }

}
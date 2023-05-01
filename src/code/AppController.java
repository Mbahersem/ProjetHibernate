
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AppController {
    

    @FXML
    private Button btAjoutLiv;

    @FXML
    private Button btEnregistrerMembre;

    @FXML
    private Button btOngInsc;

    @FXML
    private Button btnActualiserEmp;

    @FXML
    private Button btnActualiserEmp1;

    @FXML
    private Button btnAjoutEmprunt;

    @FXML
    private Button butOngEmp;

    @FXML
    private Button butOngInv;

    @FXML
    private Button butOngMem;

    @FXML
    private TableColumn<?, ?> colCNIMem;

    @FXML
    private TableColumn<?, ?> colDateEmp;

    @FXML
    private TableColumn<?, ?> colDateRend;

    @FXML
    private TableColumn<?, ?> colIdEmp;

    @FXML
    private TableColumn<?, ?> colIdLivre;

    @FXML
    private TableColumn<?, ?> colIdMem;

    @FXML
    private TableColumn<?, ?> colInvAuteur;

    @FXML
    private TableColumn<?, ?> colInvIdLiv;

    @FXML
    private TableColumn<?, ?> colInvQte;

    @FXML
    private TableColumn<?, ?> colInvTitre;

    @FXML
    private TableColumn<?, ?> colNomMem;

    @FXML
    private TableColumn<?, ?> colPrenomMem;

    @FXML
    private TableColumn<?, ?> colTelMem;

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
    private TextField tfCNI;

    @FXML
    private TextField tfEmpLiv;

    @FXML
    private TextField tfEmpMem;

    @FXML
    private TextField tfInvLiv;

    @FXML
    private TextField tfNom;

    @FXML
    private TextField tfPrenom;

    @FXML
    private TextField tfTel;

    
    @FXML
    void actualiserEmprunt(MouseEvent event) {

    }

    @FXML
    void actualiserLivreTab(MouseEvent event) {

    }

    @FXML
    void ajouterEmprunt(MouseEvent event) {
        
        int livre = Integer.parseInt(tfEmpLiv.getText());
        int membre = Integer.parseInt(tfEmpMem.getText());

        if (Emprunter.emprunter(livre,membre)) {
             
        }
    }

    @FXML
    void ajouterLivre(MouseEvent event) {

    }

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
    	Login login = new Login();
        login.enregistrer(tfNom.getText(), tfPrenom.getText(), tfTel.getText(), tfCNI.getText());
    }

}
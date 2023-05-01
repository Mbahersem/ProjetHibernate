
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
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class AppController {
    

    ObservableList<Membre> listeMembres = FXCollections.observableList(ListeMembres.afficher());

    ObservableList<Livre> listeLivre = FXCollections.observableList(ListeLivres.afficher());

    ObservableList<Emprunt> listeEmprunts = FXCollections.observableList(ListeEmprunts.afficher());

    @FXML
    private Button btAjoutLiv;

    @FXML
    private Button btEnregistrerMembre;

    @FXML
    private Button btOngInsc;

    @FXML
    private Button btnActualiserEmp;

    @FXML
    private Button btnActualiserListeMem;

    @FXML
    private TextField tfAuteur;

    @FXML
    private TextField tfTitre;

    @FXML
    private TextField tfNbreExemp;

    @FXML
    private Button btnActualiserInventaire;

    @FXML
    private Button btnAjoutEmprunt;

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
    private TableView<Membre> tabMem = new TableView<Membre>();
    tabMem.setItems(listeMembres)
    
    @FXML
    private TableColumn<Membre, Integer> colIdMem = new TableColumn<Membre, Integer>("Id");
    colIdMem.setCellValueFactory(new PropertyValueFactory("identifiant"));
    
    @FXML
    private TableColumn<Membre, String> colNomMem = new TableColumn<Membre, String>("Nom");
    colNomMem.setCellValueFactory(new PropertyValueFactory("nom"));
    
    @FXML
    private TableColumn<Membre, String> colPrenomMem = new TableColumn<Membre, String>("Prénom");
    colPrenomMem.setCellValueFactory(new PropertyValueFactory("prenom"));

    @FXML
    private TableColumn<Membre, String> colTelMem = new TableColumn<Membre, String>("Téléphone");
    colTelMem.setCellValueFactory(new PropertyValueFactory("numeroTelephone"));
    
    @FXML
    private TableColumn<Membre, String>  colCNIMem = new TableColumn<Membre, String>("CNI");
    colCNIMem.setCellValueFactory(new PropertyValueFactory("numeroCNI"));

    @FXML
    private TableColumn<?, ?> colDateEmp;

    @FXML
    private TableColumn<?, ?> colDateRend;

    @FXML
    private TableColumn<?, ?> colIdEmp;

    @FXML
    private TableColumn<?, ?> colIdLivre;

    @FXML
    private TableColumn<?, ?> colInvAuteur;

    @FXML
    private TableColumn<?, ?> colInvIdLiv;

    @FXML
    private TableColumn<?, ?> colInvQte;

    @FXML
    private TableColumn<?, ?> colInvTitre;

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

        listeEmprunts = FXCollections.observableList(ListeEmprunts.afficher());
    }

    @FXML
    void actualiserLivreTab(MouseEvent event) {

        listeLivre = FXCollections.observableList(ListeLivres.afficher());
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
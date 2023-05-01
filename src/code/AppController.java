
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

    ObservableList<Livre> listeLivres = FXCollections.observableList(ListeLivres.afficher());

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
    private TableView<Membre> tabMem = new TableView<Membre>();
    tabMem.setItems(listeMembres);
    
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
    private TableView<Emprunt> tabEmp = new TableView<Emprunt>();
    tabEmp.setItems(listeEmprunts);

    @FXML
    private TableColumn<Emprunt, Date> colDateEmp = new TableColumn<Emprunt, Date>("Date d'emprunt");
    colDateEmp.setCellValueFactory(new PropertyValueFactory("dateEmprunt"));

    @FXML
    private TableColumn<Emprunt, Date> colDateRend = new TableColumn<Emprunt, Date>("Date de rendu");
    colDateEmp.setCellValueFactory(new PropertyValueFactory("dateRendu"));
    
    @FXML
    private TableColumn<Emprunt, Integer> colIdEmp = new TableColumn<Emprunt, Integer>("Id Emprunt");
    colIdEmp.setCellValueFactory(new PropertyValueFactory("identifiant"));

    @FXML
    private TableColumn<Emprunt, Integer> colIdLivre = new TableColumn<Emprunt, Integer>("Id Livre");
    colIdLivre.setCellValueFactory(new PropertyValueFactory("livre.getIdentifiant()"));

    @FXML
    private TableColumn<Emprunt, Integer> colIdEmMem = new TableColumn<Emprunt, Integer>("Id Membre");
    colIdEmMem.setCellValueFactory(new PropertyValueFactory("membre.getIdentifiant()"));
    
    
    @FXML
    private TableView<Livre> tabInv = new TableView<Livre>() ;
    tabInv.setItems(listeLivres);
    
    @FXML
    private TableColumn<Livre, Integer> colInvIdLiv = new TableColumn<Livre, Integer>("Id Livre");
    colInvIdLiv.setCellValueFactory(new PropertyValueFactory("identifiant"));
    
    @FXML
    private TableColumn<Livre, String> colInvAuteur = new TableColumn<Livre, String>("Auteur");
    colInvAuteur.setCellValueFactory(new PropertyValueFactory("auteur"));

    @FXML
    private TableColumn<Livre, Integer> colInvQte = TableColumn<Livre, Integer>("Nombre d'exemplaires");
    colInvQte.setCellValueFactory(new PropertyValueFactory("nombreExemplaires"));

    @FXML
    private TableColumn<Livre, String> colInvTitre = TableColumn<Livre, String>("Titre");
    colInvTitre.setCellValueFactory(new PropertyValueFactory("titre"));

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
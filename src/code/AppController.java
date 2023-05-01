
package code;

import java.sql.Date;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class AppController {

    ObservableList<Membre> listeMembres;

    ObservableList<Livre> listeLivres;

    ObservableList<Emprunt> listeEmprunts;

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
    private Label lblStatutEmp;

    @FXML
    private Label lblStatutLiv;

    @FXML
    private Label lblStatutMem;
    
    @FXML
    private Pane pnEmprunt;
    
    @FXML
    private Pane pnInsc;
    
    @FXML
    private Pane pnInv;
    
    @FXML
    private Pane pnMem; 
    
    
    @FXML
    private TableView<Membre> tabMem;
 
    
    @FXML
    private TableColumn<Membre, Integer> colIdMem;
    
    @FXML
    private TableColumn<Membre, String> colNomMem;
    
    @FXML
    private TableColumn<Membre, String> colPrenomMem;
    
    @FXML
    private TableColumn<Membre, String> colTelMem;
    
    @FXML
    private TableColumn<Membre, String>  colCNIMem;

    @FXML
    private TableView<Emprunt> tabEmp;

    @FXML
    private TableColumn<Emprunt, Date> colDateEmp;

    @FXML
    private TableColumn<Emprunt, Date> colDateRend;
    
    @FXML
    private TableColumn<Emprunt, Integer> colIdEmp;

    @FXML
    private TableColumn<Emprunt, Integer> colIdLivre;

    @FXML
    private TableColumn<Emprunt, Integer> colIdEmMem;
    
    @FXML
    private TableView<Livre> tabInv;
    
    @FXML
    private TableColumn<Livre, Integer> colInvIdLiv;
    
    @FXML
    private TableColumn<Livre, String> colInvAuteur;

    @FXML
    private TableColumn<Livre, Integer> colInvQte;

    @FXML
    private TableColumn<Livre, String> colInvTitre;

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

    public void initialize() {

        listeMembres = FXCollections.observableList(ListeMembres.afficher());

        listeLivres = FXCollections.observableList(ListeLivres.afficher());
    
        listeEmprunts = FXCollections.observableList(ListeEmprunts.afficher());

        tabEmp = new TableView<Emprunt>();
        tabEmp.setItems(listeEmprunts); 
        colDateEmp = new TableColumn<Emprunt, Date>("Date d'emprunt");
        colDateEmp.setCellValueFactory(new PropertyValueFactory("dateEmprunt"));
        colDateRend = new TableColumn<Emprunt, Date>("Date de rendu");
        colDateEmp.setCellValueFactory(new PropertyValueFactory("dateRendu"));
        colIdEmp = new TableColumn<Emprunt, Integer>("Id Emprunt");
        colIdEmp.setCellValueFactory(new PropertyValueFactory("identifiant"));
        colIdLivre = new TableColumn<Emprunt, Integer>("Id Livre");
        colIdLivre.setCellValueFactory(new PropertyValueFactory("livre.getIdentifiant()"));
        colIdEmMem = new TableColumn<Emprunt, Integer>("Id Membre");
        colIdEmMem.setCellValueFactory(new PropertyValueFactory("membre.getIdentifiant()"));

        tabInv = new TableView<Livre>() ;
        tabInv.setItems(listeLivres);
        colInvIdLiv = new TableColumn<Livre, Integer>("Id Livre");
        colInvIdLiv.setCellValueFactory(new PropertyValueFactory("identifiant"));
        colInvAuteur = new TableColumn<Livre, String>("Auteur");
        colInvAuteur.setCellValueFactory(new PropertyValueFactory("auteur"));
        colInvQte = new TableColumn<Livre, Integer>("Nombre d'exemplaires");
        colInvQte.setCellValueFactory(new PropertyValueFactory("nombreExemplaires"));
        colInvTitre = new TableColumn<Livre, String>("Titre");
        colInvTitre.setCellValueFactory(new PropertyValueFactory("titre"));

        tabMem = new TableView<Membre>();
        tabMem.setItems(listeMembres);
        colIdMem = new TableColumn<Membre, Integer>("Id");
        colIdMem.setCellValueFactory(new PropertyValueFactory("identifiant"));
        colNomMem = new TableColumn<Membre, String>("Nom");
        colNomMem.setCellValueFactory(new PropertyValueFactory("nom"));
        colPrenomMem = new TableColumn<Membre, String>("Prénom");
        colPrenomMem.setCellValueFactory(new PropertyValueFactory("prenom"));
        colTelMem = new TableColumn<Membre, String>("Téléphone");
        colTelMem.setCellValueFactory(new PropertyValueFactory("numeroTelephone"));
        colCNIMem = new TableColumn<Membre, String>("CNI");
        colCNIMem.setCellValueFactory(new PropertyValueFactory("numeroCNI"));
            
    }
    
    @FXML
    void actualiserEmprunt(MouseEvent event) {
        listeEmprunts = FXCollections.observableList(ListeEmprunts.afficher());
        tabEmp.refresh();
    }

    @FXML
    void actualiserLivreTab(MouseEvent event) {

        listeLivres = FXCollections.observableList(ListeLivres.afficher());
        tabInv.refresh();
    }

    @FXML
    void actualiserListeMem(MouseEvent event) {
        
        listeMembres = FXCollections.observableList(ListeMembres.afficher());
        tabMem.refresh();
    }

    @FXML
    void ajouterEmprunt(MouseEvent event) {
        
        int livre = Integer.parseInt(tfEmpLiv.getText());
        int membre = Integer.parseInt(tfEmpMem.getText());

        if (Emprunter.emprunter(livre,membre)) {
             tfEmpMem.setText("");
             tfEmpLiv.setText("");
             lblStatutEmp.setText("Nouvel emprunt !");
         }
    }


    @FXML
    void ajouterLivre(MouseEvent event) {
        
        String titre = tfTitre.getText();
        String auteur = tfAuteur.getText();
        int nombreExemplaires = Integer.parseInt(tfNbreExemp.getText());

        if (Importation.enregistrer(titre,auteur,nombreExemplaires)) {
            tfAuteur.setText("");
            tfTitre.setText("");
            tfNbreExemp.setText("");
            lblStatutLiv.setText("Nouveau livre !");

       }
    }


    @FXML
    void ongletEmprunts(MouseEvent event) {
    	lblStatutEmp.setText("");
    	pnEmprunt.toFront();
        lblHead.setText("Emprunt");
    }

    @FXML
    void ongletInsc(MouseEvent event) {
        lblStatutMem.setText("");
    	pnInsc.toFront();
        lblHead.setText("Inscription");
    }

    @FXML
    void ongletInventaire(MouseEvent event) {
    	lblStatutLiv.setText("");
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
        Inscription.enregistrer(tfNom.getText(), tfPrenom.getText(), tfTel.getText(), tfCNI.getText());
        tfNom.setText("");
        tfPrenom.setText("");
        tfTel.setText("");
        tfCNI.setText("");
        lblStatutMem.setText("Nouveau membre ajouté !");
    }

}
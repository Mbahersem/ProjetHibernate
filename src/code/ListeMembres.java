package code;

import java.util.ArrayList;

public class ListeMembres {
 
    private ArrayList<Membre> membres = new ArrayList<Membre>();

    //Constructors
    public ListeMembres() {
    } 

    //Method to add a new Member
    public void ajouter(Membre membre) {
        membres.add(membre);
    }

    //Method to print Members
    public void afficher() {
        for (Membre membre : membres) {
            System.out.println(membre.getIdentifiant() +"  "+ membre.getNom() +"  "+ membre.getNom() +"  "+ membre.getPrenom() +"  "+ membre.getNumeroCNI() +"  "+ membre.getNumeroTelephone());
        }
    }

}

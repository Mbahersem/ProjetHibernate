package code;

import java.sql.Date;

public class Emprunt {
    
    private int identifiant;
    private Date dateEmprunt;
    private Date dateRendu;

    private Livre livre;
    private Membre membre;
    
    //Constructors
    public Emprunt() {
    }
    public Emprunt(Date dateEmprunt, Date dateRendu, Livre livre, Membre membre) {
        this.dateEmprunt = dateEmprunt;
        this.dateRendu = dateRendu;
        this.livre = livre;
        this.membre = membre;
    }

    //Setters
    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }
    public void setDateRendu(Date dateRendu) {
        this.dateRendu = dateRendu;
    }
    public void setLivre(Livre livre) {
        this.livre = livre;
    }
    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    //Getters
    public int getIdentifiant() {
        return identifiant;
    }
    public Date getDateEmprunt() {
        return dateEmprunt;
    }
    public Date getDateRendu() {
        return dateRendu;
    }
    public Livre getLivre() {
        return livre;
    }
    public Membre getMembre() {
        return membre;
    }
    
}

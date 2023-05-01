package code;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @Column(name = "idEmprunt")
    private int identifiant;
    @Column(name = "dateDeb")
    private Date dateEmprunt;
    @Column(name = "dateRendu")
    private Date dateRendu;
    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre livre;
    @ManyToOne
    @JoinColumn(name = "idMem")
    private Membre membre;
    
    //Constructors
    public Emprunt() {
    }
    public Emprunt(Livre livre, Membre membre) {
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

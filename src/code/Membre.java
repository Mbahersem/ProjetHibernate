package code;

import javax.persistence.*;

@Entity
@Table(name = "membre")
public class Membre {
    @Id
    @Column(name = "id")
    private int identifiant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "telephone")
    private String numeroTelephone;
    @Column(name = "cni")
    private String numeroCNI;
    
    //Constructors
    public Membre() {
    }
    public Membre(String nom, String prenom, String numeroTelephone, String numeroCNI) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.numeroCNI = numeroCNI;
    }
    
    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    public void setNumeroCNI(String numeroCNI) {
        this.numeroCNI = numeroCNI;
    }

    //Getters
    public int getIdentifiant() {
        return identifiant;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }
    public String getNumeroCNI() {
        return numeroCNI;
    }
     
}

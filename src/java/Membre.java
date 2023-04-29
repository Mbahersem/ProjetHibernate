package java;

public class Membre {
    
    private int identifiant;
    private String nom;
    private String prenom;
    private String numeroTelephone;
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

package code;

public class Gestionnaire {
    
    private int identifiant;
    private String motDePasse;

    //Consrtuctors
    public Gestionnaire() {
    }
    public Gestionnaire(int identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    //Setters
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    //Getters
    public int getIdentifiant() {
        return identifiant;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    
}

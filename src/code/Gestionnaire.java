package code;

public class Gestionnaire {
    
    private String identifiant;
    private String motDePasse;

    //Consrtuctors
    public Gestionnaire() {
    }
    public Gestionnaire(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    //Setters
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    //Getters
    public String getIdentifiant() {
        return identifiant;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    
}

package java;

public class Livre {
   
    private int identifiant;
    private String titre;
    private String auteur;
    private int nombreExemplaires;

    // Constructors
    public Livre() {
    }
    public Livre(String titre, String auteur, int nombreExemplaires) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreExemplaires = nombreExemplaires;
    }

    //Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setNombreExemplaires(int nombreExemplaires) {
        this.nombreExemplaires = nombreExemplaires;
    }

    //Getters
    public int getIdentifiant() {
        return identifiant;
    }
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getNombreExemplaires() {
        return nombreExemplaires;
    }
    
}

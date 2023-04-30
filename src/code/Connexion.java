package code;

public interface Connexion {
    

    public default void ouverture() {
        
    }

    public default void fermeture() {
        
    }

    public static boolean connecter(String identifiant, String motDePasse) {
        
        return Admin.verifier(identifiant,motDePasse);

    }

}

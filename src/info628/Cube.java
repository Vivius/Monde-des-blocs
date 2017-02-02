package info628;

public class Cube {
    private Couleur Couleur;
    private TailleCube Taille;

    public Cube(Couleur couleur, TailleCube taille) {
        Couleur = couleur;
        Taille = taille;
    }

    public boolean compare(TailleCube taille, Couleur couleur) {
        if(getTaille() == taille && getCouleur() == couleur)
            return true;
        else
            return false;
    }

    public Couleur getCouleur() {
        return Couleur;
    }

    public void setCouleur(Couleur couleur) {
        Couleur = couleur;
    }

    public TailleCube getTaille() {
        return Taille;
    }

    public void setTaille(TailleCube taille) {
        Taille = taille;
    }
}

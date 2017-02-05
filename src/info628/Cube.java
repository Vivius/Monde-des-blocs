package info628;

public class Cube {
    private Couleur couleur;
    private TailleCube taille;

    public Cube(Couleur couleur, TailleCube taille) {
        this.couleur = couleur;
        this.taille = taille;
    }

    public boolean compare(TailleCube taille, Couleur couleur) {
        if(getTaille() == taille && getCouleur() == couleur)
            return true;
        else
            return false;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public TailleCube getTaille() {
        return taille;
    }

    public void setTaille(TailleCube taille) {
        this.taille = taille;
    }
}

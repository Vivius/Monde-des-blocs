package info628;

import java.util.ArrayList;
import java.util.List;


public class PileCube {
    private List<Cube> cubes = new ArrayList<Cube> ();

    public PileCube() {}

    public PileCube(Cube cube) {
        empiler(cube);
    }

    /**
     * Retourne true si le cube au sommet de la pile correspond aux propriétés renseignées.
     *
     * @param taille TailleCube
     * @param couleur Couleur
     * @return boolean
     */
    public boolean compareSommet(TailleCube taille, Couleur couleur) {
        return getCubes().get(getCubes().size() - 1).compare(taille, couleur);
    }

    /**
     * Retourne true si la pile est vide.
     *
     * @return boolean
     */
    public boolean estVide() {
        return getCubes().size() == 0;
    }

    /**
     * Permet d'empiler le cube passé en paramètre.
     *
     * @param cube Cube
     */
    public void empiler(Cube cube) {
        getCubes().add(cube);
    }

    /**
     * Permet de retourner l'élément en tête de la pile (fin de liste).
     * Le cube est ensuite supprimé de la liste.
     *
     * @return Cube
     */
    public Cube depiler() {
        Cube c = getCubes().get(getCubes().size() - 1);
        getCubes().remove(c);
        return c;
    }

    public List<Cube> getCubes() {
        return cubes;
    }

    public void setCubes(List<Cube> cubes) {
        this.cubes = cubes;
    }

    @Override
    public String toString() {
        String str = "o:[  ";
        for (Cube c : getCubes())
            str += c.toString() + "  ";
        str += "]=>";
        return str;
    }
}

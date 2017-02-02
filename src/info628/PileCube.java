package info628;

import java.util.ArrayList;
import java.util.List;

public class PileCube {
    private List<Cube> cubes = new ArrayList<Cube> ();

    public boolean compareSommet(TailleCube taille, Couleur couleur) {
        return getCubes().get(getCubes().size()-1).compare(taille, couleur);
    }

    public boolean estVide() {
        return true;
    }

    public void empiler(Cube cube) {

    }

    public Cube depiler() {
        Cube c = getCubes().get(getCubes().size()-1);
        getCubes().remove(c);
        return c;
    }

    public List<Cube> getCubes() {
        return cubes;
    }

    public void setCubes(List<Cube> cubes) {
        this.cubes = cubes;
    }
}

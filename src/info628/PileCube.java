package info628;

import java.util.ArrayList;
import java.util.List;

public class PileCube {
    private List<Cube> cubes = new ArrayList<Cube> ();

    public PileCube() {}

    public PileCube(Cube cube) {
        empiler(cube);
    }

    public boolean compareSommet(TailleCube taille, Couleur couleur) {
        return getCubes().get(getCubes().size() - 1).compare(taille, couleur);
    }

    public boolean estVide() {
        return getCubes().size() == 0;
    }

    public void empiler(Cube cube) {
        getCubes().add(cube);
    }

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
        String str = "[  ";
        for (Cube c : getCubes())
            str += c.toString() + "  ";
        str += "]";
        return str;
    }
}

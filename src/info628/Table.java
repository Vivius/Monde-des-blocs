package info628;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<PileCube> pileCube = new ArrayList<PileCube> ();

    public void poserCubeSurTable(Cube cube) {

    }

    public Cube chercherCube(TailleCube taille, Couleur couleur) {
        return new Cube(couleur, taille);
    }

    public void empilerCube(Cube cube, TailleCube taille, String couleur) {

    }

    public void afficherTable() {
        System.out.println("je suis une pauvre table");
    }

}

package info628;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<PileCube> pileCube = new ArrayList<PileCube> ();

    public void poserCubeSurTable(Cube cube) {

    }

    public Cube chercherCube(TailleCube taille, Couleur couleur) {
        for (PileCube pile : getPileCube()) {
            if(pile.compareSommet(taille, couleur)) {
                return pile.depiler();
            }
        }
        return null;
    }

    public void empilerCube(Cube cube, TailleCube taille, String couleur) {

    }

    public String afficherTable() {
        String intro = "- Salut, je suis la table j'ai ";
        return intro+" "+getPileCube();
    }

    public List<PileCube> getPileCube() {
        return pileCube;
    }

    public void setPileCube(List<PileCube> pileCube) {
        this.pileCube = pileCube;
    }
}

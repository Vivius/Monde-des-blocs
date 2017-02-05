package info628;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<PileCube> pilesCube = new ArrayList<PileCube> ();

    public Table() { }

    public void poserCubeSurTable(Cube cube) {
        getPilesCube().add(new PileCube(cube));
    }

    public Cube chercherCube(TailleCube taille, Couleur couleur) {
        Cube cube = null;
        PileCube pc = null;
        for (PileCube pile : getPilesCube()) {
            if(pile.compareSommet(taille, couleur)) {
                cube =  pile.depiler();
                pc = pile;
                break;
            }
        }
        if(pc != null && pc.estVide())
            getPilesCube().remove(pc);
        return cube;
    }

    public void empilerCube(Cube cube, TailleCube taille, Couleur couleur) {

    }

    public String afficherTable() {
        String str = " - Salut, je suis la table j'ai : \n";
        for(PileCube pi : getPilesCube()) {
            str += pi.toString() + "  ";
        }
        return str;
    }

    public List<PileCube> getPilesCube() {
        return pilesCube;
    }

    public void setPilesCube(List<PileCube> pileCube) {
        this.pilesCube = pileCube;
    }
}

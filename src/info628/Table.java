package info628;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<PileCube> pilesCubes = new ArrayList<PileCube> ();

    public Table() { }

    /**
     * Crée une nouvelle pile de cube et lui insère le cube passé en paramètre.
     *
     * @param cube Cube
     */
    public void poserCubeSurTable(Cube cube) {
        PileCube pile = new PileCube();
        pile.empiler(cube);
        getPilesCubes().add(pile);
    }

    /**
     * Permet de cherche un cube de taille et couleur données sur la table (liste des piles de cubes).
     * Si un cube est trouvé, il est retourné et enlever de la pile où il a été trouvé.
     * Autrement null est renvoyé.
     *
     * @param taille TailleCube
     * @param couleur Couleur
     * @return Cube
     */
    public Cube chercherCube(TailleCube taille, Couleur couleur) {
        Cube cube = null;
        PileCube pc = null;
        for (PileCube pile : getPilesCubes()) {
            if(pile.compareSommet(taille, couleur)) {
                cube =  pile.depiler();
                pc = pile;
                break;
            }
        }
        if(pc != null && pc.estVide())
            getPilesCubes().remove(pc);
        return cube;
    }

    /**
     * Permet d'empiler le cube donné sur un cube se trouvant sur la table ayant la taille et la couleur données en paramètre.
     * Si le cube a pu être empiler, true est renvoyé.
     *
     * @param cube Cube
     * @param taille TailleCube
     * @param couleur Couleur
     * @return boolean
     */
    public boolean empilerCube(Cube cube, TailleCube taille, Couleur couleur) {
        for(PileCube pc : getPilesCubes()) {
            if(pc.compareSommet(taille, couleur)) {
                pc.empiler(cube);
                return true;
            }
        }
        return false;
    }

    public String afficherTable() {
        String str = " - Salut, je suis la table. Voici ma constitution : \n";
        for(PileCube pc : getPilesCubes()) {
            str += pc.toString() + "  ";
        }
        return str;
    }

    public List<PileCube> getPilesCubes() {
        return pilesCubes;
    }

    public void setPilesCube(List<PileCube> pileCube) {
        this.pilesCubes = pileCube;
    }
}

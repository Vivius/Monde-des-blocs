package info628;

public class Robot {
    private Cube cube;
    private Table table;

    public Robot() { }

    public Robot(Table table) {
        this.table = table;
    }

    /**
     * Indique en retournant true si la main du robot est vide, false sinon.
     *
     * @return boolean
     */
    public boolean mainVide() {
        return getCube() == null;
    }

    /**
     * Permet de créer un cube et de le placer dans la main du robot directement.
     * Cela est possible uniquement si le robot à la main vide.
     *
     * @param couleur Couleur
     * @param taille TailleCube
     */
    public void creerCube(Couleur couleur, TailleCube taille) {
        if(mainVide()) {
            setCube(new Cube(couleur, taille));
        }
    }

    /**
     * Permet de détruire le cube dans la main du robot.
     */
    public void detruireCube() {
        setCube(null);
    }

    /**
     * Permet le cube dans la main du robot sur la table.
     * Cela créer une nouvelle pile avec le cube dedans.
     */
    public void poserCubeSurTable() {
        if(!mainVide()) {
            getTable().poserCubeSurTable(getCube());
            detruireCube();
        }
    }

    /**
     * Permet de prendre un cube sur la table ayant les propriétés définies en paramètre.
     *
     * @param taille TailleCube
     * @param couleur Couleur
     */
    public void prendreCubeSurTable(TailleCube taille, Couleur couleur) {
        if(mainVide()) {
            Cube tempCube;
            if((tempCube = getTable().chercherCube(taille, couleur)) != null) {
                setCube(tempCube);
            }
        }
    }

    /**
     * Permet de poser le cube se trouvant dans la main du robot sur un cube de taille compatible parmi ceux se trouvant sur la table.
     * Il faut définir la taille et la couleur du cube sur lequel on veut se placer.
     *
     * @param taille TailleCube
     * @param couleur Couleur
     */
    public void poserCubeSurCube(TailleCube taille, Couleur couleur) {
        if(!mainVide()) {
            if(poserCubeCompatible(taille)) {
                if(getTable().empilerCube(getCube(), taille, couleur))
                    detruireCube();
            }
        }
    }

    /**
     * Détermine si le cube se trouvant dans la main du robot peut être placé sur la taille donnée en paramètre.
     *
     * @param taille TailleCube
     * @return boolean
     */
    private boolean poserCubeCompatible(TailleCube taille) {
        if(getCube().getTaille() == TailleCube.grand && taille == TailleCube.grand)
            return true;
        else if(getCube().getTaille() == TailleCube.moyen && (taille == TailleCube.grand || taille == TailleCube.moyen))
            return true;
        else if(getCube().getTaille() == TailleCube.petit)
            return true;
        return  false;
    }

    public String afficherRobot() {
        String intro = " - Bonjour, je suis le robot. Dans ma main j'ai : ";
        if(mainVide()) return(intro + "rien");
        else return(intro + "un cube de taille '" + getCube().getTaille().toString() + "' et de couleur '" + getCube().getCouleur().toString() + "'");
    }

    public Cube getCube() {
        return cube;
    }

    public void setCube(Cube cube) {
        this.cube = cube;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}

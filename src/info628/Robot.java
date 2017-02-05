package info628;

public class Robot {
    private Cube cube;
    private Table table;

    public Robot() { }

    public Robot(Table table) {
        this.table = table;
    }

    public boolean mainVide() {
        return getCube() == null;
    }

    public void creerCube(Couleur couleur, TailleCube taille) {
        if(mainVide()) {
            setCube(new Cube(couleur, taille));
        }
    }

    public void detruireCube() {
        setCube(null);
    }

    public void poserCubeSurTable() {
        if(!mainVide()) {
            getTable().poserCubeSurTable(getCube());
            detruireCube();
        }
    }


    public void prendreCubeSurTable(TailleCube taille, Couleur couleur) {
        if(mainVide()) {
            Cube tempCube;
            if((tempCube = getTable().chercherCube(taille, couleur)) != null) {
                setCube(tempCube);
            }
        }
    }

    public void poserCubeSurCube(TailleCube taille, Couleur couleur) {
        if(!mainVide()) {
            if(poserCubeCompatible(taille)) {
                if(getTable().empilerCube(getCube(), taille, couleur))
                    detruireCube();
            }
        }
    }

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

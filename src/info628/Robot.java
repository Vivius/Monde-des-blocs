package info628;

public class Robot {
    private Cube cube;
    private Table table;

    public Robot(Table table) {
        this.table = table;
    }

    public boolean mainVide() {
        if(getCube() == null)
            return true;
        else
            return false;
    }

    public void creerCube(Couleur couleur, TailleCube taille) {
        if(mainVide()) {
            setCube(new Cube(couleur, taille));
        }
    }

    public void detruireCube() {

    }

    public void poserCubeSurTable() {

    }


    public void prendreCubeSurTable(TailleCube taille, String couleur) {

    }

    public void poserCubeSurCube(TailleCube taille, String couleur) {

    }

    private boolean poserCubeCompatible(TailleCube taille) {
        return true;
    }

    public void afficherRobot() {
        System.out.println("je suis le robot");
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

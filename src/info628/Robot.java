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

    public void setCube(Cube cube) {

    }

    public void detruireCube() {

    }

    public void poserCubeSurTable() {

    }

    public Cube getCube() {
        return this.cube;
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

}

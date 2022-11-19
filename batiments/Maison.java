public class Maison extends Batiment {
    private int nbPiece;
    private double jardin;

    public Maison(int nbPiece, double jardin, String adresse, double surface){
        super(adresse, surface);
        this.jardin = jardin;
        this.nbPiece = nbPiece;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSurface du jardin : " + jardin + " mètres carrés\nNombre de pièces : " + nbPiece;
    }
}
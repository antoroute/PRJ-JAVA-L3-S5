public class Maison extends Batiment {
    private int nbPiece;
    private double jardin;

    public Maison(String adresse, double surface,int nbPiece, double jardin){
        super(adresse, surface);
        this.jardin = jardin;
        this.nbPiece = nbPiece;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSurface du jardin : " + jardin + " mètres carrés\nNombre de pièces : " + nbPiece;
    }
}
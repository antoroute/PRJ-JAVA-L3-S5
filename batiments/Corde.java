

public class Corde extends Instrument{
    static private double longueur;
    static private double largeur;

    public Corde(){}
    public Corde(double longueur, double largeur){
        super();

        this.largeur = largeur;
        this.longueur = longueur;

    }
    static public double getLongueur(){
        return longueur;
    }
    static public double getLargeur(){
        return largeur;
    }
}
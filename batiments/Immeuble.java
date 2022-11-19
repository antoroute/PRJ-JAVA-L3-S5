public class Immeuble extends Batiment{

    static private int nbAppartements;

    public Immeuble(){

    }

    public Immeuble(int nbAppartements,String adresse, double surface){
        super(adresse, surface);
        this.nbAppartements = nbAppartements;
    }

    static public int getNbAppartements(){
        return nbAppartements;
    }

}
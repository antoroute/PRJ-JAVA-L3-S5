public class Immeuble extends Batiment{

    static private int nbAppartements;

    public Immeuble(){

    }

    public Immeuble(String adresse, double surface,int nbAppartements){
        super(adresse, surface);
        this.nbAppartements = nbAppartements;
    }

    static public int getNbAppartements(){
        return nbAppartements;
    }

}
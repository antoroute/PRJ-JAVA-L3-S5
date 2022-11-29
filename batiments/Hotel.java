public abstract class  Hotel implements Batiment{

    static private int nbChambres;
    static private int nbSuites;
    static private int nbPiscines;
    static private int nbSpas;
    static private int nbEtoiles;

    public Hotel() {}

    public Hotel(int nbChambres, int nbSuites, int nbPiscine, String adresse, double surface) {
        super(adresse,surface);
        //Batiment.surface(this)
        this.nbChambres = nbChambres;
        this.nbSuites = nbSuites;
        this.nbPiscines = nbPiscine;
        this.nbSpas = 0;
        this.nbEtoiles = 5;
    }

    public Hotel(int nbChambres, int nbSpas) {
        super();
        this.nbChambres = nbChambres;
        this.nbSuites = 0;
        this.nbPiscines = 1;
        this.nbSpas = nbSpas;
        this.nbEtoiles = 4;
    }

    static public int getNbChambres(){
        return nbChambres;
    }

    static public int getNbSuites(){
        return nbSuites;
    }

    static public int getNbPiscines(){
        return nbPiscines;
    }

    static public int getNbSpas(){
        return nbSpas;
    }

}
public class Guitare_acoustique extends Guitare{
    static private String mainForte;
    static private int tirant;

    public Guitare_acoustique(String nom, double prixAchat ,double prixVente ,double longueur, double largeur,String mainForte, int tirant){
        super(nom,prixAchat,prixVente,longueur,largeur);
        this.mainForte=mainForte;
        this.tirant=tirant;
    }

    static public String getMainForte(){
        return mainForte;
    }

    static public int getTirant(){
        return tirant;
    }
}

public class Guitare_acoustique extends Guitare{
    static private String mainForte;
    static private int tirant;

    public Guitare_acoustique(String mainForte, int tirant){
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

public class Guitare_electrique extends Guitare{
    static private boolean amplificateur;
    static private boolean pedaleEffetSonore;

    public Guitare_electrique(boolean amplificateur, boolean pedaleEffetSonore) {
        this.amplificateur = amplificateur;
        this.pedaleEffetSonore = pedaleEffetSonore;
    }

    static public boolean getAmplificateur(){
        return amplificateur;
    }

    static public boolean getPedaleEffetSonore(){
        return pedaleEffetSonore;
    }


}

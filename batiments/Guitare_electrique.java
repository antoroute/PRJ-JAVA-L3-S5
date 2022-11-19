public class Guitare_electrique extends Guitare{
    static private boolean amplificateur;
    static private boolean pedaleEffetSonore;

    public Guitare_electrique(String nom, double prixAchat ,double prixVente ,double longueur, double largeur,boolean amplificateur, boolean pedaleEffetSonore) {
        super(nom,prixAchat,prixVente,longueur,largeur);
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

public class Piano_numerique extends Piano{
    private boolean toucherLourd;
    private int qualiteEchantillon;


    public Piano_numerique() {}

    public Piano_numerique(String nom, double prixAchat ,double prixVente ,double longueur, double largeur,String typePiano, int nbTouches, boolean toucherLourd, int qualiteEchantillon,String typeCordes, boolean silencieux) {
        super(nom,prixAchat ,prixVente ,longueur,largeur,typePiano,nbTouches);
        this.toucherLourd = toucherLourd;
        this.qualiteEchantillon = qualiteEchantillon;
    }    
}

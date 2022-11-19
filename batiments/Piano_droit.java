public class Piano_droit extends Piano{
    private String typeCordes;
    private boolean silencieux;

    public Piano_droit() {}

    public Piano_droit(String nom, double prixAchat ,double prixVente ,double longueur, double largeur,String typePiano, int nbTouches, boolean toucherLourd, int qualiteEchantillon,String typeCordes, boolean silencieux) {
        super(nom,prixAchat ,prixVente ,longueur,largeur,typePiano,nbTouches,toucherLourd,qualiteEchantillon);
        this.typeCordes = typeCordes;
        this.silencieux = silencieux;
    }
}

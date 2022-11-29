public class Piano extends Corde{
    private String typePiano;
    private int nbTouches;

    public Piano() {}

    public Piano (String nom, double prixAchat ,double prixVente ,double longueur, double largeur,String typePiano, int nbTouches) {
        super(nom,prixAchat,prixVente,longueur,largeur);
        this.typePiano = typePiano;
        this.nbTouches = nbTouches;
    }
}
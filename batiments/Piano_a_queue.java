public class Piano_a_queue extends Piano {
    private String taille;

    public Piano_a_queue() {}

    public Piano_a_queue(String nom, double prixAchat ,double prixVente ,double longueur, double largeur,String typePiano, int nbTouches,String taille) {
        super(nom,prixAchat ,prixVente ,longueur,largeur,typePiano,nbTouches);
        this.taille = taille;
    }
}

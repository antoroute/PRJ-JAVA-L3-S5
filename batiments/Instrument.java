public class Instrument {
    static private String nomInstrument;
    static private double prixAchat;
    static private double prixVente;

    public Instrument(){}

    public Instrument(String nom, double prixAchat ,double prixVente){
        this.nomInstrument = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    static public String getNomInstrument(){
        return nomInstrument;
    }

    static public double getPrixAchat(){
        return prixAchat;
    }

    static public double getPrixVente() {
        return prixVente;
    }

    static public void setNomInstrument(String nom){
        nomInstrument = nom;
    }
}
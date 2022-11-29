package Instrument;

public class Vent extends Instruments{
    private String type;
    public Vent(String nom, double prixAchat ,double prixVente ,String type) {
        Instruments.nomInstru=nom;
        super(nom, prixAchat, prixVente);
        if (nom == "clarinette") setType("anche simple");
        if (nom == "flute") setType("biseau");
        if (nom == "hautbois") setType("anche double");
    }

    public void setType(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        return(super.toString()+type);
    }

}
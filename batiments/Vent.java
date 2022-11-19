public class Vent extends Instrument{

    public Vent(String nom, double prixAchat ,double prixVente ,String type) {
        super(nom, prixAchat, prixVente);
        if (type == "anche simple") Instrument.setNomInstrument("clarinette");
        if (type == "biseau") Instrument.setNomInstrument("flûte");
        if (type == "anche double") Instrument.setNomInstrument("hautbois");
    }

}
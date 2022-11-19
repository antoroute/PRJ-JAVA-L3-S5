public class Vent extends Instrument{

    public Vent(String type) {
        if (type == "anche simple") Instrument.setNomInstrument("clarinette");
        if (type == "biseau") Instrument.setNomInstrument("flûte");
        if (type == "anche double") Instrument.setNomInstrument("hautbois");
    }

}
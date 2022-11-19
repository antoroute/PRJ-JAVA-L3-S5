public class Piano extends Corde{
    private String typePiano;
    private int nbTouches;
    private boolean toucherLourd;
    private int qualiteEchantillon;

    public Piano() {}

    public Piano (String typePiano, int nbTouches, boolean toucherLourd, int qualiteEchantillon) {
        super();
        this.typePiano = typePiano;
        this.nbTouches = nbTouches;
        this.toucherLourd = toucherLourd;
        this.qualiteEchantillon = qualiteEchantillon;
    }
}
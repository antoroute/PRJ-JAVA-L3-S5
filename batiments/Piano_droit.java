public class Piano_droit extends Piano{
    private String typeCordes;
    private boolean silencieux;

    public Piano_droit() {}

    public Piano_droit(String typeCordes, boolean silencieux) {
        this.typeCordes = typeCordes;
        this.silencieux = silencieux;
    }
}

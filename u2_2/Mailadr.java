public final class Mailadr extends Expr {
    public final String name;
    public static final String AT = "@"; // static final
    public final String ending;

    public Mailadr(String name, String ending) {
        this.name = name;
        this.ending = ending;
    }

    @Override
    public String toString() {
        return this.name + AT + this.ending;
    }
}
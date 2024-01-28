public final class Ending extends Expr {
    public final String ending;

    public Ending(String ending) {
        this.ending = ending;
    }

    @Override
    public String toString() {
        return this.ending;
    }
}
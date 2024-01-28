public final class Mailadr extends Expr {
    public final String user;
    public static final String MAILSIGN = "@";
    public final String ending;

    public Mailadr(String user, String ending) {
        this.user = user;
        this.ending = ending;
    }

    @Override
    public String toString() {
        return this.user + MAILSIGN + this.ending;
    }
}
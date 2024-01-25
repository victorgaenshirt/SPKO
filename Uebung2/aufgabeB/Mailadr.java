public final class Mailadr extends Expr {
    public final String name;
    public final String domain;
    public final String ending;

    public Mailadr(String name, String domain, String ending) {
        this.name = name;
        this.domain = domain;
        this.ending = ending;
    }

    @Override
    public String toString() {
        return this.name + "@" + this.domain + this.ending;
    }
}
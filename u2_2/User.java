public final class User extends Expr {
    public final String user;

    public User(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return this.user;
    }
}
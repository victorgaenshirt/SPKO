// Beispielprogramm zu Folie 4-11/12/13
public final class StaticScoping{
    private StaticScoping() { }

    private static int n;

    private static void f() {
        n = 1;
    }

    private static void g() {
        int n = 0;
        f();
    }

    public static void main(String[] args) {
        n = 2;
        f();
        System.out.print(n); // 2 oder 1?
        n = 3;
        g();
        System.out.print(n); // 3 oder 1?
    }
}

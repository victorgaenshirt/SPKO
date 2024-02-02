// Scott 3.3.3
public final class DeclOrder333 {
    private DeclOrder333() { }

    private static int n = 1;

    private static void f() {
        int m = n;
        System.out.println(m);
        int n = 2;
        System.out.println(n);
    }

    public static void main(String[] args) {
        f();
        System.out.println(n);
    }
}


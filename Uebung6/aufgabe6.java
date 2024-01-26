package Uebung6;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public final class Aufgabe6 {
    private Aufgabe6() { }

    public static void main(String[] args) throws Exception {
        Class<?> cl1 = Class.forName("java.lang.String");
        Class<?> cl2 = Class.forName("java.util.Iterator");
        Class<?> cl3 = Class.forName("java.time.Month");

        Class<?> arr[] = {cl1, cl2, cl3};

        ST templ = new STGroupFile("aufgabe6.stg").getInstanceOf("root");
        templ.add("n", arr);
        String page = templ.render();
        System.out.println(page);
    }
}

//How to compile: javac Aufgabe6.java -cp ST-4.3.4.jar:antlr-4.9.2-complete.jar
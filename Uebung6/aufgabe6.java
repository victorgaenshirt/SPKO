package Uebung6;

import org.stringtemplate.v4.*;
public final class aufgabe6 {
    private aufgabe6() { }

    public static void main(String[] args) throws Exception {
        Class<?> cl1 = Class.forName("java.lang.String");
        Class<?> cl2 = Class.forName("java.lang.Iterator");
        Class<?> cl3 = Class.forName("java.time.Month");

        Class<?> arr[] = {cl1, cl2, cl3};

        ST templ = new STGroupFile("aufgabe.stg").getInstanceOf("root");
        templ.add("n", arr);
        String page = templ.render();
        System.out.println(page);
    }
}

//How to compile: javac -classpath antlr-4.9.2-complete.jar aufgabe6.java
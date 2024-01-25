package Uebung4;

import java.util.Arrays;
import java.util.List;

public class TestingFunctionalStuff {


    public static void main(String[] args) {
        funky1();
    }


    static void funky1() {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        list.forEach((x) -> System.out.println(x));
        list.forEach((x)-> {System.out.println(x*x);});

        list.stream().map(x*x).filter(null);
    }
    
}

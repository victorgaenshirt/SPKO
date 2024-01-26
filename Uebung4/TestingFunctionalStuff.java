package Uebung4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestingFunctionalStuff {


    public static void main(String[] args) {
        funky1();
    }


    static void funky1() {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        list.forEach((x) -> System.out.println(x));
        list.forEach((x)-> {System.out.println(x*x);});

        Stream<Integer> stream1 = list.stream()
                                        .map((x)->x*x)
                                        .filter(x->x<=1000);
        // list.stream().sum(x);
        long langeZahl = stream1.count();

        IntStream.range(1, 21)
                .parallel()
                .forEach(System.out::println);

     

    }
    
}

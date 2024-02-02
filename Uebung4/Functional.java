package Uebung4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public final class Functional {
    private Functional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        
        long start = System.nanoTime();

        // Optional.ofNullable

        long n = Files.newBufferedReader(Paths.get(args[0]))
                        .lines()
                        .filter(x-> ! x.isEmpty())
                        .filter(x -> x.length() >= MIN_LENGTH)
                        .peek(System.out::println)
                        .flatMapToInt(CharSequence::chars)
                        .count();
        
        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

}
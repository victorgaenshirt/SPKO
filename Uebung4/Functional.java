package Uebung4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.ListIterator;


public final class Functional {
    private Functional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get(args[0]);
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        // readLines_old(Files.newBufferedReader(input), lines);

        BufferedReader reader = Files.newBufferedReader(input);


        
        

        kontrollPrint(lines);
        removeEmptyLines(lines);
        kontrollPrint(lines);

        removeShortLines(lines);
        kontrollPrint(lines);

        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }



    private static void readLinesFunc(BufferedReader reader, LinkedList<String> list) {
        
        boolean done = false;
        while (!done) {
            try {
                String line = reader.readLine();
                                
                if (line != null) {
                    list.add(line);   
                } else {
                    done = true;
                }
            
            }
            catch (IOException e) {
                System.err.println("ioexception: etwas hat nicht gepasst...");
            }
            
        }

        return;
    }


    private static void readLines_old(BufferedReader reader, LinkedList<String> list) {
        
        boolean done = false;
        while (!done) {
            try {
                String line = reader.readLine();
                                
                if (line != null) {
                    list.add(line);   
                } else {
                    done = true;
                }
            
            }
            catch (IOException e) {
                System.err.println("ioexception: etwas hat nicht gepasst...");
            }
            
        }

        return;
    }

    private static void removeEmptyLines(LinkedList<String>  list) {
        System.out.println("removeEmptyLines");

        var iter = list.listIterator();

        while (iter.hasNext()) {
            String eintrag = iter.next();
            if (eintrag.isEmpty()) {
                iter.remove();
            }
            
        }
        return;
    }


    private static void removeShortLines(LinkedList<String> list) {

        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {

            String eintrag = iter.next();
            System.out.println(eintrag.length());
            if (eintrag.length() <= 20) {
                iter.remove();
            }
        }

        return;
    }


    private static int totalLineLengths(LinkedList<String> list) {
        int counter = 0;
        return counter;
    }


    private static void kontrollPrint(LinkedList<String> list) {
        
        System.out.println("========KONTROLLPRINT========");

        for (String string : list) {
            System.out.println("line: " + string);
        }    

        return;
    }

}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe1a {
    static String input1 = "xxx %d yyy%n";
    static String input2 = "xxx% 012d yyy%%";
    static String input3 = "xxx%1$d yyy";
    static String input4 = "%1$0+(32.10fyyy";
    static String input5 = "Wochentag: %tA Uhrzeit: %tT";

    public static void main(String[] args) {
        parse(input1);
        parse(input2);
        parse(input3);
        parse(input4);
        parse(input5);
    }

    private static void parse(String input) {
            Pattern pattern = Pattern.compile("(%(\\d+\\$)?([-#+ 0,(<]*)?(\\d+)?(\\.\\d+)?[tT]?[a-zA-Z%])");
            Matcher matcher = pattern.matcher(input);
            int readIndex = 0;
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    String textBefore = input.substring(readIndex, start);
                    System.out.println("TEXT(\"" + textBefore + "\")");
                    String match = matcher.group();
                    System.out.println("FORMAT(\"" + match + "\")");
                    readIndex = end;
                }
                String textAfter = input.substring(readIndex);
                if(!textAfter.isEmpty()) {
                    System.out.println("TEXT(\"" + textAfter + "\")");
                }
                System.out.println("\n\n");
    }
}



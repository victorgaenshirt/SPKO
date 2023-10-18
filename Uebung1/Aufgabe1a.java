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
        //parse(input2);
        //parse(input3);
        //parse(input4);
        //parse(input5);
    }

    private static void parse(String input) {
            Pattern pattern = Pattern.compile("(%(\\d+\\$)?([-#+ 0,(<]*)?(\\d+)?(\\.\\d+)?[tT]?[a-zA-Z%])");
            Matcher matcher = pattern.matcher(input);
            int lastEnd = 0;

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String unmatch = input.substring(lastEnd, start);
            System.out.println("TEXT(\"" + unmatch + "\")");

            String formatSpecifier = input.substring(start, end);
            System.out.println("FORMAT(\"" + formatSpecifier + "\")");

            lastEnd = end;
        }
            String stillText = input.substring(lastEnd);
            System.out.println("TEXT(\\\"\" + stillText + \"\\\")");

            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }
              /*  while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    String match = input.substring(start, end);
                    String unmatch = input.substring(end, input.length());
                    System.out.println("FORMAT(\"" + match + "\")");
                    System.out.println("TEXT(\"" + unmatch + "\")");
                    String formatSpecifier = matcher.group();
                }

               */
    }
}



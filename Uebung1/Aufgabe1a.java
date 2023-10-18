import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe1a {
    static String input1 = "xxx %d yyy%n";
    static String input2 = "xxx% 012d yyy%%";
    static String input3 = "xxx%1$d yyy";
    static String input4 = "%1$0+(32.10fyyy";
    static String input5 = "Wochentag: %tA Uhrzeit: %tT";

    static Pattern pattern;
    static Matcher matcher;

    static StringBuilder finalOutput;
    static int counter = 0;
    public static void main(String[] args) {

        parse(input1);
        parse(input2);
        parse(input3);
        parse(input4);
        parse(input5);
    }

    private static void parse(String input) {

/*            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }*/

        pattern = Pattern.compile("(%(\\d+\\$)?([-#+ 0,(<]*)?(\\d+)?(\\.\\d+)?[tT]?[a-zA-Z%])");

        System.out.println("String to parse:\n" + input + "\n");
        finalOutput = new StringBuilder();
        parseSubstring(input);


        System.out.println("FinalString: " + finalOutput.toString());
        System.out.println("---------------------------------");
    }

    private static void parseSubstring(String subStr) {

        matcher = pattern.matcher(subStr);

        if  (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String textDavor = subStr.substring(0, start);
            String formatMatch = subStr.substring(start, end);
            String textDanach = subStr.substring(end, subStr.length());
            if (start != 0) {
                finalOutput.append(generateTextOutput(textDavor));
            }
            finalOutput.append(generateFormatOutput(formatMatch));
            //finalOutput.append(generateTextOutput(textDavor));
            //System.out.println(generateTextOutput(textDanach));
            //System.out.println(generateFormatOutput(formatMatch));
            //System.out.println(generateTextOutput(textDanach));
            //String formatSpecifier = matcher.group();
            if (subStr.length() - end > 0 ) {
                String nextRoundStr = subStr.substring(end, subStr.length());
                System.out.println("nextRoundStr: " + nextRoundStr);
                parseSubstring(nextRoundStr);
            }
        }
        else {
            System.out.println(generateTextOutput(subStr));
            finalOutput.append(generateTextOutput(subStr));
        }

    }


    private static String generateTextOutput(String str) {
        String res = "TEXT(\"" + str + "\")";
        return res;
    }


    private static String generateFormatOutput(String str) {
        String res = "FORMAT(\"" + str + "\")";
        return res;
    }

}

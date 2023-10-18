import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Aufgabe1b {
    public static void main(String[] args) {
        String input1 = "It's 12 pm, not noon. Midnight at 12am.";
        parse(input1);
}
    private static void parse(String input) {

        String regex = "\\b(12|(0?[1-9])):(0?[0-5][0-9])\\s?(am|pm|midnight|noon)\\b"; //12-Stunden-Format
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String match = matcher.group();
            System.out.println("Found: " + match);
        }
    }
}
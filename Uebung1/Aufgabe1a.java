public class Aufgabe1a {

    static String input1 = "xxx %d yyy%n";
    static String input2 = "xxx% 012d yyy%%";
    static String input3 = "xxx%1$d yyy";
    static String input4 = "%1$0+(32.10fyyy";
    static String input5 = "Wochentag: %tA Uhrzeit: %tT";



    public static void main(String[] args) {
        String[] strings = new String[]{input1, input2, input3, input4, input5};

        parseAllStrings(strings);
    }

    private static boolean parseAllStrings(String[] strings) {

        for (String s : strings
             ) {
            if (parseOneString(s) == false) {
                return false;
            }
        }

        return true;
    }


    private static boolean parseOneString(String s) {

        //laufe den String zeichenweise ab, ob ein Prozentzeichen vorkommt

        //falls nein, alles nur Text

        return false;
    }

}



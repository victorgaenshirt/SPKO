public class Aufgabe1a {

    static String input1 = "xxx %d yyy%n";
    static String input2 = "xxx% 012d yyy%%";
    static String input3 = "xxx%1$d yyy";
    static String input4 = "%1$0+(32.10fyyy";
    static String input5 = "Wochentag: %tA Uhrzeit: %tT";



    public static void main(String[] args) {
        //String[] strings = new String[]{input1, input2, input3, input4, input5};
        String[] strings = new String[]{"grueziWohl!", "hallo%boi"};

        parseAllStrings(strings);
    }

    private static boolean parseAllStrings(String[] strings) {

        for (String s : strings
             ) {
            if (parseOneString(s) == false) {
                System.err.println("Der String " + s + " + konnte nicht korrekt geparst werden. " +
                        "Eventuell ist der Format-String nicht korrekt.");
                return false;
            }
        }

        return true;
    }


    private static boolean parseOneString(String s) {

        System.out.println("-------- parsing String " +s+ "--------");

        //laufe den String zeichenweise ab, ob ein Prozentzeichen vorkommt
        int posOfPercentCypher = s.indexOf("%");

        //falls nein, alles nur Text
        if (posOfPercentCypher == -1) {
            System.out.println("(es gibt keine Prozentzeichen im String " + s + ")");
            System.out.println(returnAsText(s));
            return true;
        }



        return false;
    }


    private static String returnAsText(String s) {
        return "TEXT(\"" + s + "\")";
    }



}
public class NumberSemantic extends Java20ParserBaseListener {
    @Override
    public void enterNumericType(Java20Parser.NumericTypeContext ctx) {
        String number = ctx.getText();
        try {
            if (text.endsWith("L") || text.endsWith("l")) {
                long value = Long.parseLong(text.substring(0, text.length() - 1));
                System.out.println("Found Long: " + value);
            } else {
                int value = Integer.parseInt(text);
                System.out.println("Found Integer: " + value);
            }
        } catch (NumberFormatException e) {
            System.err.println("Number out of range: " + text);
        }
    }
}




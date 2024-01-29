import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParsetreeToAST {

    private ParsetreeToAST() { }
    public static void main(String[] args) throws Exception {
        Aufgabe2aLexer lexer = new Aufgabe2aLexer(CharStreams.fromStream(System.in));
        Aufgabe2aParser parser = new Aufgabe2aParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }


        Expr ast = new MailBuilder().build(tree);
        System.out.printf("Expr.toString() = \"%s\"%n", ast);
    }
}






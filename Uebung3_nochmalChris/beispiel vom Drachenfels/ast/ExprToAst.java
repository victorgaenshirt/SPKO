// ExprToAst.java
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ExprToAst {
    private ExprToAst() { }

    public static void main(String[] args) throws Exception {
        ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Expr ast = new ExprBuilder().build(tree);
        System.out.printf("Expr.toString() = \"%s\"%n", ast);
    }
}



/*


# add this to your .bash_profile
/home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/lib/antlr-4.13.1-complete.jar

export CLASSPATH="/home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/lib/antlr-4.13.1-complete.jar"

# simplify the use of the tool to generate lexer and parser

alias antlr4='java -Xmx500M -cp "/home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/lib/antlr-4.13.1-complete.jar"
 org.antlr.v4.Tool'


# simplify the use of the tool to test the generated code
alias grun='java -Xmx500M -cp "/home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/lib/antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig'



antlr4 -cp "/home/xymint/studium/faecher/WS2324/sprachkonzepte/uebung/SPKO/lib/antlr-4.13.1-complete.jar"
 org.antlr.v4.Tool

 */
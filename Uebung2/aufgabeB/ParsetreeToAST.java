package aufgabeB;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Aufgabe2aLexer;
import Aufgabe2aParser;
public class ParsetreeToAST {
    public static void main(String[] args) {
        Aufgabe2aLexer lexer = new Aufgabe2aLexer(CharStreams.fromStream(System.in));
        Aufgabe2aParser parser = new Aufgabe2aParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.email();
    }
}





import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class MailBuilder extends Aufgabe2aParserBaseListener {
    private Stack<Expr> stack = new Stack<>();

    public Expr build(ParseTree tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return stack.pop();
    }

    @Override
    public void exitExpr(Aufgabe2aParser.ExprContext ctx) {
        if (ctx.getChildCount() == 2) {
            Expr user = stack.pop();
            Expr ending = stack.pop();
            String userPart = ctx.getChild(0).getText();
            String endingPart = ctx.getChild(1).getText();
            stack.push(new Mailadr(userPart, endingPart));
        }
    }

    @Override
    public void exitDomainPart(Aufgabe2aParser.UserPartContext ctx) {
        String UserPart = ctx.getText();
        stack.push(new User(UserPart));
    }

    @Override
    public void exitDomainPart(Aufgabe2aParser.DomainPartContext ctx) {
        String DomainPart = ctx.getText();
        stack.push(new Ending(DomainPart));
    }
}
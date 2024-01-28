public final class MailBuilder extends Aufgabe2aParserBaseListener {
    private Stack<Expr> stack = new Stack<>();

    public Mail build(ParseTree tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return stack.pop();
    }

    @Override
    public void exitMail(Aufgabe2aParser.ExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            Expr user = stack.pop();
            Expr ending = stack.pop();
            String mailsign = "@";
            stack.push(new Mail(user, mailsign, ending));
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
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class Week1Visitor extends AbstractParseTreeVisitor<String> implements CharactersVisitor<String> {
    @Override public String visitCharstring(CharactersParser.CharstringContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.somechar().size(); ++i) {
            sb.append(visit(ctx.somechar(i)));
        }
        return sb.toString();
    }

    @Override
    public String visitIdentifier(CharactersParser.IdentifierContext ctx) {
        return "\""+ctx.getText()+"\" : identifier\n";
    }

    @Override
    public String visitOperation(CharactersParser.OperationContext ctx) {
        return "\""+ctx.getText()+"\" : operation\n";
    }

    @Override
    public String visitSemicolon(CharactersParser.SemicolonContext ctx) {
        return "\""+ctx.getText()+"\" : semicolon\n";
    }

    @Override
    public String visitKeyword(CharactersParser.KeywordContext ctx) {
        return "\""+ctx.getText()+"\" : keyword\n";
    }

    @Override
    public String visitInteger(CharactersParser.IntegerContext ctx) {
        return "\""+ctx.getText()+"\" : integer\n";
    }

    @Override public String visitUppercaseChar(CharactersParser.UppercaseCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : uppercase\n";
    }
    @Override public String visitLowercaseChar(CharactersParser.LowercaseCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : lowercase\n";
    }
    @Override
    public String visitDigitChar(CharactersParser.DigitCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : numeric\n";
    }

    @Override
    public String visitWhitespaceChar(CharactersParser.WhitespaceCharContext ctx) {
        return "\""+ctx.getText()+"\" : whitespace\n";
    }

    @Override
    public String visitExtendedChar(CharactersParser.ExtendedCharContext ctx) {
        return "\""+ctx.getText()+"\" : extended character\n";
    }

    @Override
    public String visitPunctuationChar(CharactersParser.PunctuationCharContext ctx) {
        return "\""+ctx.getText()+"\" : punctuation\n";
    }

    @Override
    public String visitOtherChar(CharactersParser.OtherCharContext ctx) {
        return "unprintable\n";
    }
}

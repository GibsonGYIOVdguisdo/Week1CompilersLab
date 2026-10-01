// Generated from C:/Users/gh379/Documents/Programming/Week1/week1/src/Characters.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CharactersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CharactersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CharactersParser#charstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharstring(CharactersParser.CharstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UppercaseChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercaseChar(CharactersParser.UppercaseCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowercaseChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowercaseChar(CharactersParser.LowercaseCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DigitChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitChar(CharactersParser.DigitCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhitespaceChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespaceChar(CharactersParser.WhitespaceCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PunctuationChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunctuationChar(CharactersParser.PunctuationCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtendedChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedChar(CharactersParser.ExtendedCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OtherChar}
	 * labeled alternative in {@link CharactersParser#somechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherChar(CharactersParser.OtherCharContext ctx);
}
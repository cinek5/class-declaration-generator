// Generated from Generator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(GeneratorParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#attrdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrdef(GeneratorParser.AttrdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#attrname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrname(GeneratorParser.AttrnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(GeneratorParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(GeneratorParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(GeneratorParser.SetterContext ctx);
}
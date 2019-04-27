// Generated from Generator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeneratorParser}.
 */
public interface GeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(GeneratorParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(GeneratorParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#attrdef}.
	 * @param ctx the parse tree
	 */
	void enterAttrdef(GeneratorParser.AttrdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#attrdef}.
	 * @param ctx the parse tree
	 */
	void exitAttrdef(GeneratorParser.AttrdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#attrname}.
	 * @param ctx the parse tree
	 */
	void enterAttrname(GeneratorParser.AttrnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#attrname}.
	 * @param ctx the parse tree
	 */
	void exitAttrname(GeneratorParser.AttrnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(GeneratorParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(GeneratorParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(GeneratorParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(GeneratorParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(GeneratorParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(GeneratorParser.SetterContext ctx);
}
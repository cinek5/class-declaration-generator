import com.sun.istack.internal.NotNull;
import model.Attrdef;
import model.Root;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Cinek on 27.04.2019.
 */
public class GeneratorListenerCompiler {


    public Root parse(String code)
    {
        CharStream charStream = new ANTLRInputStream(code);
        GeneratorLexer lexer = new GeneratorLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        GeneratorParser parser = new GeneratorParser(tokens);

        RootListener rootListener = new RootListener();
        parser.root().enterRule(rootListener);
        return rootListener.getParsedRoot();
    }

    class RootListener extends GeneratorBaseListener {

        private Root parsedRoot = null;

        @Override
        public void enterRoot(@NotNull GeneratorParser.RootContext ctx) {
            String typeName = ctx.TYPENAME().getText();
            AttrdefListener attrdefListener = new AttrdefListener();
            ctx.attrdef().forEach(attrdef -> attrdef.enterRule(attrdefListener));
            Collection<Attrdef> attrdefs = attrdefListener.getAttrdefs();
            parsedRoot = new Root(typeName, attrdefs);
        }

        public Root getParsedRoot() {
            return parsedRoot;
        }


    }

    class AttrdefListener extends GeneratorBaseListener {

        private Collection<Attrdef> attrdefCollection= new ArrayList<>();


        @Override
        public void enterAttrdef(@NotNull GeneratorParser.AttrdefContext ctx) {
            String attrName = ctx.attrname().getText();
            String typeName = ctx.typename().getText();
            boolean hasGetter = ctx.getter()!=null;
            boolean hasSetter = ctx.setter()!=null;

            Attrdef attrdef = new Attrdef(attrName, typeName, hasGetter, hasSetter);

            attrdefCollection.add(attrdef);


        }


        public Collection<Attrdef> getAttrdefs()
        {
            return attrdefCollection;
        }
    }

}

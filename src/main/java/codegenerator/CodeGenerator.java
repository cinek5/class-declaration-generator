package codegenerator;

import model.Attrdef;
import model.Root;

/**
 * Created by Cinek on 27.04.2019.
 */
public class CodeGenerator {

    private Root root;

    public CodeGenerator(Root root)
    {
        this.root = root;
    }


    public String generateSourceCode()
    {
        String classDeclarationBegin = "public class "+root.getTypeName() + " { ";
        StringBuilder classDeclaration = new StringBuilder(classDeclarationBegin);
        classDeclaration.append(twoLineSeperators());

        classDeclaration.append(generateAttrDeclarations());

        classDeclaration.append(twoLineSeperators());

        classDeclaration.append(generateGetters());

        classDeclaration.append(twoLineSeperators());

        classDeclaration.append(generateSetters());

        classDeclaration.append("}");

        return classDeclaration.toString();
    }

    private String twoLineSeperators() {
        return "\n\n";
    }

    private StringBuilder generateAttrDeclarations()
    {
        StringBuilder attrDeclarations = new StringBuilder();
        for (Attrdef attrdef: root.getAttrdefs())
        {
            attrDeclarations.append(generateAttrDeclaration(attrdef));
        }
        return attrDeclarations;
    }

    private String generateAttrDeclaration(Attrdef attrdef)
    {
        String attrDeclaration = "\tprivate "+attrdef.getTypeName()+ " " + attrdef.getAttrName() + "; \n";
        return attrDeclaration;
    }

    private StringBuilder generateGetters()
    {
        StringBuilder getters = new StringBuilder();
        for (Attrdef attrdef: root.getAttrdefs())
        {
            getters.append(generateGetter(attrdef));
        }

        return getters;

    }
    private String generateGetter(Attrdef attdef)
    {
        String getterDeclaration = "\tpublic "+attdef.getTypeName() + " get"+firstLetterToUppercase(attdef.getAttrName())+"() {\n"+
                "\t\t return "+attdef.getAttrName()+";\n"+"\t}\n";

        return getterDeclaration;
    }


    private StringBuilder generateSetters()
    {
        StringBuilder setters = new StringBuilder();
        for (Attrdef attrdef: root.getAttrdefs())
        {
            setters.append(generateSetter(attrdef));
        }

        return setters;

    }
    private String generateSetter(Attrdef attdef)
    {
        String setterDeclaration = "\tpublic void set"+firstLetterToUppercase(attdef.getAttrName())+"( "+
                attdef.getTypeName()+ " "+attdef.getAttrName()+" ) {\n"+
                "\t\t  this."+attdef.getAttrName()+" = "+attdef.getAttrName()+";\n"+"\t}\n";

        return setterDeclaration;

    }

    private String firstLetterToUppercase(String s)
    {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }


}

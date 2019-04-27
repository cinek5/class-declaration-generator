import codegenerator.CodeGenerator;
import model.Root;

/**
 * Created by Cinek on 27.04.2019.
 */
public class Main {
    public static void main(String[] args)
    {
        GeneratorListenerCompiler generatorListenerParser = new GeneratorListenerCompiler();
        Root root = generatorListenerParser.parse("Osoba[ imie oftype String get ; nazwisko oftype String ; rok oftype int get set; ] \n");

        CodeGenerator codeGenerator = new CodeGenerator(root);

        System.out.println(codeGenerator.generateSourceCode());
    }
}

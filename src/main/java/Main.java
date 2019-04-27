import codegenerator.CodeGenerator;
import filewriter.StringBuilderToFileDumper;
import model.Root;

import java.io.IOException;

/**
 * Created by Cinek on 27.04.2019.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        GeneratorListenerCompiler generatorListenerParser = new GeneratorListenerCompiler();
        Root root = generatorListenerParser.parse("Osoba[ imie oftype String get ; nazwisko oftype String ; rok oftype int get set; ] \n");

        CodeGenerator codeGenerator = new CodeGenerator(root);

        StringBuilder code =codeGenerator.generateSourceCode();
        StringBuilderToFileDumper dumper = new StringBuilderToFileDumper();
        dumper.writeToFile(codeGenerator.getFileName(), code );
    }
}

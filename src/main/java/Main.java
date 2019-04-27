import codegenerator.CodeGenerator;
import filewriter.StringBuilderToFileDumper;
import model.Root;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Cinek on 27.04.2019.
 */
public class Main {

    private static  final Logger logger = Logger.getLogger("err.log");

    public static void main(String[] args) {




        Scanner reader =  new Scanner(System.in);

        Root root;

        while(true) {
            System.out.println("Podaj definicje klasy: ");

            String input = reader.nextLine();

            try {
                root = parseInput(input);
                break;
            } catch (SyntaxErrorException e) {
                System.out.println("Błąd składniowy: ");
                System.out.println(e.getMessage());

                System.out.println("Sprawdź składnie i spróbuj ponownie");
            }
        }


        CodeGenerator codeGenerator = new CodeGenerator(root);

        StringBuilder code =codeGenerator.generateSourceCode();
        StringBuilderToFileDumper dumper = new StringBuilderToFileDumper();
        try {
            dumper.writeToFile(codeGenerator.getFileName(), code );
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Nie udało się zapisać do pliku", e);
        }
    }

    public static Root parseInput(String input) throws SyntaxErrorException {
        GeneratorListenerCompiler generatorListenerParser = new GeneratorListenerCompiler();
        Root root = null;
        try
        {
            root = generatorListenerParser.parse(input);
        } catch (ParseCancellationException ex)
        {
            throw new SyntaxErrorException(ex.getMessage(), ex);
        }
        return root;
    }
}

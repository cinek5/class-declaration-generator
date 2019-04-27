package filewriter;

import java.io.*;

/**
 * Created by Cinek on 27.04.2019.
 */
public class StringBuilderToFileDumper {

    public void writeToFile(String filename, StringBuilder stringBuilder) throws IOException {
        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(stringBuilder.toString());
        }
    }
}

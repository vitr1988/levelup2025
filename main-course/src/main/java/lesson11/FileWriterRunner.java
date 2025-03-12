package lesson11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FileWriterRunner {

    public static final String SRC_RESOURCES_WORD_TXT = "src/resources/word.txt";

    public static void main(String[] args) throws IOException {
        try (FileWriter fileWriter = new FileWriter(SRC_RESOURCES_WORD_TXT, true)) {
            for (int i = 0; i < 100; i++) {
                fileWriter.write("Bye " + i + "\n");
            }
        }
        PrintStream out = System.out;
        out.println("fadfda");
    }
}

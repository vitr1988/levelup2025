package lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static lesson11.FileWriterRunner.SRC_RESOURCES_WORD_TXT;

public class FileRunner {

    public static void main(String... args) throws Exception {
//        File file = new File(SRC_RESOURCES_WORD_TXT);

        Path path = Paths.get("src", "resources", "word.txt");
        File file = path.toFile();

//        File file = new File("fdadfa/fdafad");
        if (file.exists()) {
            System.out.println("Файл существует");
            try (FileInputStream fileInputStream = new FileInputStream(file)) {

            }
            System.out.println(file.length());
        }
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.canExecute());

        printWord(0);
        printWord(0, "1");
        printWord(0, "1", "2");
        printWord(0, "1", "2", "3");
    }

    public static void printWord(int value, String... words) {
        for (String str : words) {
            System.out.print(str);
        }
        System.out.println();
    }
}

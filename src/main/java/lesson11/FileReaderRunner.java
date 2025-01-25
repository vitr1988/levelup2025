package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileReaderRunner {

    private static final String SRC_RESOURCES_TEST_TXT = "src/resources/test.txt";

    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader(SRC_RESOURCES_TEST_TXT, StandardCharsets.UTF_8);
             BufferedReader fileReader = new BufferedReader(fr, 1024)) {
            fileReader.lines().forEach(System.out::println);
//            char[] buffer = new char[4];
//            while (fileReader.read(buffer) >= 0) {
//                System.out.println(new String(buffer));
//            }
        }

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            long value = scanner.nextLong();
            System.out.println("Вы ввели число %d".formatted(value));

        }
//        catch (FileNotFoundException fe) {
//            System.out.printf("Файл %s не найден", SRC_RESOURCES_TEST_TXT);
//        } catch (IOException e) {
//            System.out.printf("Файл %s невозможно прочитать", SRC_RESOURCES_TEST_TXT);
//        }
    }
}

package lesson12.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class SerializationEmployeeRunner {

    public static void main(String[] args) throws Exception {
        Employee employee = new Employee(
                "Ivanov Vitaly", 20,
                new Position(1L, "Expert", new BigDecimal("1000000"))
        );
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("src/resources/employee.data");
                ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        ) {
            oos.writeObject(employee);
        }

    }
}

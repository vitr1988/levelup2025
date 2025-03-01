package lesson19;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private int id = -1;
    private String name;
    private String bossName;
    private Integer positionId;

    public Employee(String name, Integer positionId) {
        this(-1, name, positionId);
    }

    public Employee(int id, String name, Integer positionId) {
        this(id, name, null, positionId);
    }
}

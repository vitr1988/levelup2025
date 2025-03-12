package lesson19;

import lesson20.model.EmployeeType;
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
    private EmployeeType type;
    private Integer positionId;

    public Employee(String name, Integer positionId,  EmployeeType type) {
        this(-1, name, positionId, type);
    }

    public Employee(int id, String name, Integer positionId,  EmployeeType type) {
        this(id, name, null, type, positionId);
    }

    public Employee(int id, String name, Integer positionId) {
        this(id, name, null, EmployeeType.STAFF, positionId);
    }
}

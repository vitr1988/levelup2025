package lesson20.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@ToString
@Data
@NoArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees_seq_gen")
    @SequenceGenerator(name = "employees_seq_gen", sequenceName = "employees_seq", allocationSize = 1)
    @Column(name = "id")
//    @IdClass(Con.class)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "position_id")
    private Integer positionId;

    @Column(name = "boss_id")
    private Integer bossId;

    public Employee(lesson19.Employee employee) {
        this(employee, false);
    }

    public Employee(lesson19.Employee employee, boolean idNeedInitialized) {
        if (idNeedInitialized) {
            this.id = employee.getId();
        }
        this.name = employee.getName();
        this.positionId = employee.getPositionId();
    }
}

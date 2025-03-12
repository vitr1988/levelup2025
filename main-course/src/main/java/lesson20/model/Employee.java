package lesson20.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Transient;

import static lesson20.model.Employee.RESULT_SET_MAPPING;

@Entity
//@ToString
@Data
@NoArgsConstructor
@Table(name = "employees")
@SqlResultSetMapping(name = RESULT_SET_MAPPING, classes = {
        @ConstructorResult(targetClass = lesson19.Employee.class,
                columns = {
                        @ColumnResult(name = "id"),
                        @ColumnResult(name = "name"),
                        @ColumnResult(name = "positionId")
                })
})
public class Employee {

    public static final String RESULT_SET_MAPPING = "EmployeeResultSet";

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees_seq_gen")
    @SequenceGenerator(name = "employees_seq_gen", sequenceName = "employees_seq", allocationSize = 1)
    @Column(name = "id")
//    @IdClass(Con.class)
    private Integer id;

    @Column(name = "name")
    private String name;

//    @Column(name = "position_id")
    @Embedded
    private Position position;

    @Column(name = "boss_id")
    private Integer bossId;

    @Enumerated(EnumType.STRING)
    private EmployeeType type;

    @Transient
    private boolean isNew;

    public Employee(lesson19.Employee employee) {
        this(employee, false);
    }

    public Employee(lesson19.Employee employee, boolean idNeedInitialized) {
        if (idNeedInitialized) {
            this.id = employee.getId();
        }
        this.name = employee.getName();
        this.position = employee.getPositionId() == null ? null : new Position().setPositionId(employee.getPositionId());
        this.type = employee.getType();
    }
}

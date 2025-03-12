package lesson22.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@ToString(exclude = {"position", "boss"})
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees_seq_gen")
    @SequenceGenerator(name = "employees_seq_gen", sequenceName = "employees_seq", allocationSize = 1)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = ALL)
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToOne(cascade = ALL)//(fetch = FetchType.LAZY)
    @JoinColumn(name = "boss_id")
    private Emp boss;

    public Emp(String name) {
        this.name = name;
    }
}

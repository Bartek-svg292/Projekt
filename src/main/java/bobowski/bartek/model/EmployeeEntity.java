package bobowski.bartek.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @Column(name = "employee_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "salary")
    private BigInteger salary;

    public EmployeeEntity(String name, String lastName, BigInteger salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
}

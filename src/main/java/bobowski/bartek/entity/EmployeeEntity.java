package bobowski.bartek.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
@Table
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String name;
    private String lastName;
    private BigInteger salary;

    public EmployeeEntity(String name, String lastName, BigInteger salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
}
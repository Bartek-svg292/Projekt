package bobowski.bartek.Model;


import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "salary")
    private int salary;

    public EmployeeEntity(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
}

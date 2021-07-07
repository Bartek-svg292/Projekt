package bobowski.bartek.dto;


import bobowski.bartek.entity.EmployeeEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    private String name;
    private String lastName;
    private BigInteger salary;
    private EmployeeEntity employeeEntity;


    public EmployeeDTO(String name, String lastName, BigInteger salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " pensja : " + salary + " zł";
    }


}

package bobowski.bartek.dto;


import bobowski.bartek.entity.EmployeeEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    private String name;
    private String lastName;
    private EmployeeEntity employeeEntity;


    public EmployeeDTO(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " ";
    }


}

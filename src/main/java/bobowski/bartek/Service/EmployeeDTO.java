package bobowski.bartek.Service;

import bobowski.bartek.Model.EmployeeEntity;
import lombok.Data;


@Data
public class EmployeeDTO {


    private String name;
    private String lastName;

    public EmployeeDTO(EmployeeEntity employeeEntity){
        this.setName(employeeEntity.getName());
        this.setLastName(employeeEntity.getLastName());
    }


}

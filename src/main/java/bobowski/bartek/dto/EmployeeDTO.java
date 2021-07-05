package bobowski.bartek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDTO {

    private String name;
    private String lastName;

    @Override
    public String toString() {
        return name + " " + lastName + " ";
    }

}

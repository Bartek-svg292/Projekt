package bobowski.bartek.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "department")
@Table
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;

    public DepartmentEntity(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return departmentName + " ";
    }
}

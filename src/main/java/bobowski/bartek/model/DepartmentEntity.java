package bobowski.bartek.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department")
public class DepartmentEntity {

    @Id
    @Column(name = "depar_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(name = "depar_name")
    private String departmentName;

    @Override
    public String toString() {
        return departmentName + " ";
    }

    public DepartmentEntity(String departmentName) {
        this.departmentName = departmentName;
    }
}

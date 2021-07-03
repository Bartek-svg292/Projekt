package bobowski.bartek.Model;

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
    @Column(name = "depar_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deparid;
    @Column(name = "depar_name")
    private String deparname;






}

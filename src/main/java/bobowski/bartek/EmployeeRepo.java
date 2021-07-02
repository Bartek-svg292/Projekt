package bobowski.bartek;

import bobowski.bartek.Model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.SqlResultSetMapping;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {



    @Query(value = "SELECT name, lastName FROM employee")
    List<EmployeeEntity> getNameAndLastName();



}

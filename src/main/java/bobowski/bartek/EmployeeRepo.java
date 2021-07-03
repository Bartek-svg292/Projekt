package bobowski.bartek;

import bobowski.bartek.Model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {

    @Query("SELECT name, lastName FROM employee")
    List<EmployeeEntity> getNameAndLastName();

}

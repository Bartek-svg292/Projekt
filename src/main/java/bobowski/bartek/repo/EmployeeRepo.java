package bobowski.bartek.repo;

import bobowski.bartek.dto.NameAndLastNameDTO;
import bobowski.bartek.dto.SalaryDTO;
import bobowski.bartek.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {

    @Query("SELECT NEW bobowski.bartek.dto.NameAndLastNameDTO (name, lastName) FROM employee")
    List<NameAndLastNameDTO> getNameAndLastName();

    @Query("SELECT NEW bobowski.bartek.dto.SalaryDTO (sum(salary)) FROM employee")
    SalaryDTO getSalary();


}
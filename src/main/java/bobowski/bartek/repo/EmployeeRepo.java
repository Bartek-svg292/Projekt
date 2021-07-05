package bobowski.bartek.repo;

import bobowski.bartek.dto.EmployeeDTO;
import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {

    @Query(value = "SELECT NEW bobowski.bartek.dto.EmployeeDTO (name, lastName) FROM employee")
    List<EmployeeDTO> getNameAndLastName();

    @Query("SELECT NEW bobowski.bartek.dto.EmployeeSalaryDTO (sum(salary)) FROM employee")
    EmployeeSalaryDTO getSalary();


}
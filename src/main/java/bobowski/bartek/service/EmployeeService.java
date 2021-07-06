package bobowski.bartek.service;

import bobowski.bartek.dto.EmployeeDTO;
import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import bobowski.bartek.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return employeeRepo.save(employeeEntity);
    }


    public List<EmployeeEntity> findAllEmployess() {

        return employeeRepo.findAll();

    }


    public List<EmployeeDTO> getNameAndLastName() {

        return employeeRepo.getNameAndLastName();

    }

    public EmployeeSalaryDTO getSumOfSalary() {

        return employeeRepo.getSalary();

    }


}

package bobowski.bartek.service;

import bobowski.bartek.repo.EmployeeRepo;
import bobowski.bartek.dto.EmployeeDTO;
import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return employeeRepo.save(employeeEntity);
    }


    public List<EmployeeDTO> findNameAndLastName() {

        return employeeRepo.getNameAndLastName();

    }

    public EmployeeSalaryDTO getSumOfSalary() {

        return employeeRepo.getSalary();

    }


}

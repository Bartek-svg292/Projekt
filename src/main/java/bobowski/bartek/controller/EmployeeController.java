package bobowski.bartek.controller;

import bobowski.bartek.dto.EmployeeDTO;
import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import bobowski.bartek.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public List<EmployeeDTO> findAllEmployees() {
        return employeeRepo.getNameAndLastName();
    }

    @GetMapping("/salary")
    public EmployeeSalaryDTO getSumOfSalary() {
        return employeeRepo.getSalary();
    }

    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeDTO employee) {
        return employeeRepo.save(employee.getEmployeeEntity());
    }


}

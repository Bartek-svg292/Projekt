package bobowski.bartek.controller;

import bobowski.bartek.dto.EmployeeDTO;
import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import bobowski.bartek.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeEntity> findAllEmployees() {
        return employeeService.findAllEmployess();
    }

    @GetMapping("/salary")
    public EmployeeSalaryDTO getSumOfSalary() {
        return employeeService.getSumOfSalary();
    }

    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.addEmployee(employee.getEmployeeEntity());
    }


}

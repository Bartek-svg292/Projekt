package bobowski.bartek.controller;

import bobowski.bartek.dto.EmployeeSalaryDTO;
import bobowski.bartek.entity.EmployeeEntity;
import bobowski.bartek.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.addEmployee(employee);
    }

    @RequestMapping("/employee/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable Long id){
            return employeeService.findById(id);
    }


}

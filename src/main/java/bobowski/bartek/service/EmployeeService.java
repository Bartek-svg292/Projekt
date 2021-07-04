package bobowski.bartek.service;

import bobowski.bartek.repo.EmployeeRepo;
import bobowski.bartek.dto.NameAndLastNameDTO;
import bobowski.bartek.dto.SalaryDTO;
import bobowski.bartek.model.EmployeeEntity;
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


    public List<NameAndLastNameDTO> findNameAndLastName() {

        return employeeRepo.getNameAndLastName();

    }

    public SalaryDTO getSumOfSalary() {

        return employeeRepo.getSalary();

    }


}

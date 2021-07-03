package bobowski.bartek.Service;

import bobowski.bartek.EmployeeRepo;
import bobowski.bartek.Model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity){
        return employeeRepo.save(employeeEntity);
    }

    public List<EmployeeEntity> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public List<EmployeeDTO> findNameAndLastName(){

        return employeeRepo.getNameAndLastName().stream()
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }




}

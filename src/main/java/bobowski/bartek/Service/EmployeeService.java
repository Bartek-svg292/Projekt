package bobowski.bartek.Service;

import bobowski.bartek.EmployeeRepo;
import bobowski.bartek.Model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

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

    public List<EmployeeEntity> getNameAndLastName(){
        return employeeRepo.getNameAndLastName();
    }



}

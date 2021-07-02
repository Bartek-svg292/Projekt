package bobowski.bartek.Service;

import bobowski.bartek.DepartmentRepo;
import bobowski.bartek.Model.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public DepartmentEntity addDepartment (DepartmentEntity departmentEntity){
        return departmentRepo.save(departmentEntity);
    }

    public List<DepartmentEntity> findAllDepartments(){
        return departmentRepo.findAll();
    }

}

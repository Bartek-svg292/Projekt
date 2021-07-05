package bobowski.bartek.service;

import bobowski.bartek.entity.DepartmentEntity;
import bobowski.bartek.repo.DepartmentRepo;
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

    public DepartmentEntity addDepartment(DepartmentEntity departmentEntity) {
        return departmentRepo.save(departmentEntity);
    }

    public List<DepartmentEntity> findAllDepartments() {
        return departmentRepo.findAll();
    }

}

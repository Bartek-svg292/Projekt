package bobowski.bartek.controller;

import bobowski.bartek.dto.DepartmentDTO;
import bobowski.bartek.entity.DepartmentEntity;
import bobowski.bartek.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/addDepartment")
    public DepartmentEntity addDepartment(@RequestBody DepartmentDTO departmentDTO) {
        return departmentRepo.save(departmentDTO.getDepartmentEntity());
    }

    @GetMapping("/departments")
    public List<DepartmentEntity> findAllDepartments() {
        return departmentRepo.findAll();
    }

}

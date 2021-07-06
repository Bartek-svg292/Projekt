package bobowski.bartek.controller;

import bobowski.bartek.dto.DepartmentDTO;
import bobowski.bartek.entity.DepartmentEntity;
import bobowski.bartek.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public DepartmentEntity addDepartment(@RequestBody DepartmentDTO departmentDTO) {
        return departmentService.addDepartment(departmentDTO.getDepartmentEntity());
    }

    @GetMapping("/departments")
    public List<DepartmentEntity> findAllDepartments() {
        return departmentService.findAllDepartments();
    }

}

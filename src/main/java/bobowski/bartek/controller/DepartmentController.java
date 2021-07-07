package bobowski.bartek.controller;

import bobowski.bartek.dto.DepartmentDTO;
import bobowski.bartek.entity.DepartmentEntity;
import bobowski.bartek.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public DepartmentEntity addDepartment(@RequestBody DepartmentDTO department) {
        return departmentService.addDepartment(department.getDepartmentEntity());
    }

    @GetMapping("/departments")
    public List<DepartmentEntity> findAllDepartments() {
        return departmentService.findAllDepartments();
    }

    @RequestMapping("/department/{id}")
    public Optional<DepartmentEntity> findEmployeeById(@PathVariable Long id){
        return departmentService.findById(id);
    }

}

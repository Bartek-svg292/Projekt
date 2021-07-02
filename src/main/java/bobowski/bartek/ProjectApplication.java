package bobowski.bartek;

import bobowski.bartek.Model.EmployeeEntity;
import bobowski.bartek.Service.DepartmentService;
import bobowski.bartek.Service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {


	public ProjectApplication(EmployeeService employeeService, DepartmentService departmentService) {
		this.employeeService = employeeService;
		this.departmentService = departmentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	private final EmployeeService employeeService;
	private final DepartmentService departmentService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(departmentService.findAllDepartments());

		List<EmployeeEntity> allEmployee = employeeService.findAllEmployee();
		new ArrayList<>(allEmployee);

		for (EmployeeEntity e : allEmployee){
			System.out.println(e);
		}

		System.out.println("-----------------------");




	}
}

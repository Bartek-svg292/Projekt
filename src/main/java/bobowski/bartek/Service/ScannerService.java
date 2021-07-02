//package bobowski.bartek.Service;
//
//
//import bobowski.bartek.DepartmentRepo;
//import bobowski.bartek.EmployeeRepo;
//import bobowski.bartek.Model.DepartmentEntity;
//import bobowski.bartek.Model.EmployeeEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//@Service
//public class ScannerService {
//
//    Scanner scanner = new Scanner(System.in);
//
//    private final EmployeeService employeeService;
//    private final DepartmentService departmentService;
//    private final EmployeeRepo employeeRepo;
//    private final DepartmentRepo departmentRepo;
//
//
//    public ScannerService(EmployeeService employeeService, DepartmentService departmentService, EmployeeRepo employeeRepo, DepartmentRepo departmentRepo) {
//        this.employeeService = employeeService;
//        this.departmentService = departmentService;
//        this.employeeRepo = employeeRepo;
//        this.departmentRepo = departmentRepo;
//    }
//
//    public EmployeeEntity logic(){
//
//        System.out.println("Wybierz 1 aby dodać dział do firmy");
//        System.out.println("Wybierz 2 aby wyświetlić działy znajdujące się w firmie");
//
//        int firstChoice = scanner.nextInt();
//
//        if(firstChoice == 1){
//
//            departmentService.addDepartment();
//            System.out.println("Dodałeś dział");
//            return logic();
//
//        }else if (firstChoice == 2){
//
//                List<DepartmentEntity> allDepartment = departmentService.findAllDepartments();
//                new ArrayList<>(allDepartment);
//                for (DepartmentEntity e : allDepartment){
//                System.out.println(e);
//                 }
//
//                System.out.println("Wybierz 1 aby dodać pracownika");
//                System.out.println("Wybierz 2 aby wyświetlić liste pracowników");
//
//                int secondChoice = scanner.nextInt();
//
//                if(secondChoice == 1) {
//
//                    employeeService.addEmployee();
//                    System.out.println("Dodałeś pracownika");
//
//                }else if (secondChoice == 2){
//
//
//
//                }
//
//
//        }
//
//
//
//    }
//
//
//}

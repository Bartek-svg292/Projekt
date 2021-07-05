package bobowski.bartek.service;

import bobowski.bartek.entity.DepartmentEntity;
import bobowski.bartek.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Scanner;


@Service
public class ScannerService {

    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    public ScannerService(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }


    public void run() {

        do {
            System.out.println("Wybierz 1 aby dodać dział do firmy");
            System.out.println("Wybierz 2 aby wyświetlić wszystki działy znajdujące się w firmie");

            Scanner scanner = new Scanner(System.in);
            int firstChoice = scanner.nextInt();


            switch (firstChoice) {
                case 1:
                    System.out.println("Podaj nazwę działu jaki chcesz dodać : ");
                    String departmentName = scanner.next();

                    DepartmentEntity departmentEntity = new DepartmentEntity(departmentName);
                    departmentService.addDepartment(departmentEntity);

                    System.out.println("Dodałeś dział o nazwie : " + departmentName);

                    break;
                case 2:
                    System.out.println("Wszystkie działy aktualnie znajdujące się w naszej firmie : " +
                            departmentService.findAllDepartments());

                    System.out.println("Nacisnij 1 aby dodać pracownika");
                    System.out.println("Nacisnij 2 aby wyświetlić listę pracowników");


                    int secondChoice = scanner.nextInt();

                    switch (secondChoice) {
                        case 1:

                            System.out.println("Podaj imie pracownika");
                            String employeeName = scanner.next();
                            System.out.println("Podaj nazwisko pracownika");
                            String employeeLastName = scanner.next();
                            System.out.println("Podaj pensje pracownika");
                            BigInteger employeeSalary = scanner.nextBigInteger();

                            EmployeeEntity employeeEntity = new EmployeeEntity(employeeName, employeeLastName, employeeSalary);
                            employeeService.addEmployee(employeeEntity);
                            System.out.println("Dodałeś pracownika : " +
                                    employeeName + " " +
                                    employeeLastName +
                                    " o wynagordzeniu : " +
                                    employeeSalary);
                            break;

                        case 2:
                            System.out.println("Wszyscy pracownicy zatrudnieni w firmie : " +
                                    employeeService.findNameAndLastName() +
                                    employeeService.getSumOfSalary());
                            break;
                    }
            }


        } while (true);


    }


}
package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.homework26.Employee;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private  final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(
            @RequestParam("name") String name,
            @RequestParam ("lasName") String lastName
    ) {
        return   employeeService.addEmployee(name,lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(
            @RequestParam ("name") String name,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.removeEmployee(name, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(
            @RequestParam ("name") String name,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.findEmployee(name, lastName);
    }



    @GetMapping("/allEmployees")

    public List <Employee> getAllEmployee() {

        return employeeService.getAllEmployees();
    }
}

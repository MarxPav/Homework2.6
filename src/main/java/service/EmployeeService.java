package service;

import exceptions.EmployeeAlreadyAddedException;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;
import ru.skypro.homework.homework26.Employee;

import java.util.List;

@Service

public interface EmployeeService {
    Employee addEmployee (String name, String lastName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException;
    Employee removeEmployee (String name, String lastName) throws EmployeeNotFoundException;
    Employee findEmployee (String name, String lastName)throws EmployeeNotFoundException;

    List<Employee> getAllEmployees();
}

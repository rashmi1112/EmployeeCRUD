package io.EmployeeCRUD.EmployeeCRUDService.controller;

import java.util.Optional;
import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import io.EmployeeCRUD.EmployeeCRUDService.exceptions.UserNotFoundException;
import io.EmployeeCRUD.EmployeeCRUDService.service.EmployeeInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getEmployeesData")
public class EmployeeInformationController {

    @Autowired
    private EmployeeInformationService employeeInformationService;

    @RequestMapping("/{employeeId}")
    public Optional<Employee> getEmployeeData(@PathVariable("employeeId") String employeeId) {
        Optional<Employee> emp = employeeInformationService.getEmployeeDetails(employeeId);
        System.out.print(employeeId);
        System.out.print(emp);
        if (emp.isEmpty()){
            throw new UserNotFoundException("User not found for ID:" + employeeId);
        }
        return emp;
    }
}

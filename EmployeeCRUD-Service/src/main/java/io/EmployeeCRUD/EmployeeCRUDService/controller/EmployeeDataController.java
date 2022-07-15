package io.EmployeeCRUD.EmployeeCRUDService.controller;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import io.EmployeeCRUD.EmployeeCRUDService.entity.EmployeeDetails;
import io.EmployeeCRUD.EmployeeCRUDService.service.EmployeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeDataController {

    @Autowired
    private EmployeeDataService employeeDataService;

    @RequestMapping("/getEmployeesData")
    public EmployeeDetails getEmployeesData(){
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployees(employeeDataService.getEmployeeRecords());
        return employeeDetails;
    }


}

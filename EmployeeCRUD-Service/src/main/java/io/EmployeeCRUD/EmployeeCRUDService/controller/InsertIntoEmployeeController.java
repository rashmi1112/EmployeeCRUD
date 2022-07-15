package io.EmployeeCRUD.EmployeeCRUDService.controller;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import io.EmployeeCRUD.EmployeeCRUDService.service.InsertIntoEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class InsertIntoEmployeeController {

    @Autowired
    private InsertIntoEmployeeService insertIntoEmployeeService;

    @RequestMapping(value = "/insertIntoEmployeeTable", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int insertIntoEmployeeTable(@RequestBody Employee emp){
        System.out.println(emp);
        return insertIntoEmployeeService.insertEmployee(emp);
    }
}

package io.EmployeeCRUD.EmployeeCRUDService.controller;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class updateEmployeeRecordController {

    @Autowired
    private io.EmployeeCRUD.EmployeeCRUDService.service.updateEmployeeRecordService updateEmployeeRecordService;

    @RequestMapping(value = "/updateEmployeeRecord/{id}", method = PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int insertIntoEmployeeTable(@RequestBody Employee emp, @PathVariable int id){
        return updateEmployeeRecordService.updateEmployeeRecord(emp, id);
    }
}

package io.EmployeeCRUD.EmployeeCRUDService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
public class deleteEmployeeRecordController {
    @Autowired
    private io.EmployeeCRUD.EmployeeCRUDService.service.deleteEmployeeRecordService deleteEmployeeRecordService;

    @RequestMapping(value = "/DeleteEmployeeRecord/{id}", method = DELETE)
    public void deleteEmployeeRecord(@PathVariable int id){
        System.out.println(id);
        deleteEmployeeRecordService.deleteEmployeeRecord(id);
    }
}

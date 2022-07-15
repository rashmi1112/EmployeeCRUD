package io.EmployeeOrchestration.EmployeeOrchestration.controller;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import io.EmployeeOrchestration.EmployeeOrchestration.service.UpdateEmployeeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/orchestration")
public class UpdateEmployeeRecordController {

    @Autowired
    UpdateEmployeeRecordService updateEmployeeRecordService;

    @RequestMapping(value = "/updateEmployeeDetails/{id}", method=PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateEmployeeRecord(@RequestBody Employee emp, @PathVariable int id){
         return updateEmployeeRecordService.updateEmployeeRecord(emp, id);
    }
}

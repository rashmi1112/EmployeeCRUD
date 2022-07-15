package io.EmployeeOrchestration.EmployeeOrchestration.controller;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import io.EmployeeOrchestration.EmployeeOrchestration.service.AddNewEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value="/orchestration")
public class AddNewEmployeeController {

    @Autowired
    AddNewEmployeeService addNewEmployeeService;

    @RequestMapping(value="/AddNewEmployee", method= POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public int addNewEmployee(@RequestBody Employee emp){
        System.out.println("Hello there");
        System.out.println(emp);
        return addNewEmployeeService.addNewEmployee(emp);
    }
}

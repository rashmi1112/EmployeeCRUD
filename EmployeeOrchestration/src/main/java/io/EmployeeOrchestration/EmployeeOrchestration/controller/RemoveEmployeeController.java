package io.EmployeeOrchestration.EmployeeOrchestration.controller;

import io.EmployeeOrchestration.EmployeeOrchestration.service.RemoveEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orchestration")
public class RemoveEmployeeController {

    @Autowired
    RemoveEmployeeService removeEmployeeService;

    @RequestMapping(value="/RemoveEmployee/{id}", method= RequestMethod.DELETE)
    public String removeEmployee(@PathVariable int id){
        return removeEmployeeService.removeEmployee(id);
    }
}

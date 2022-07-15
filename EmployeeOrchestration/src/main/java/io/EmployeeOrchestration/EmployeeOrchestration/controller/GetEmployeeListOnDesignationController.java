package io.EmployeeOrchestration.EmployeeOrchestration.controller;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import io.EmployeeOrchestration.EmployeeOrchestration.resource.EmployeeDetails;
import io.EmployeeOrchestration.EmployeeOrchestration.service.GetEmployeeListDesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/orchestration")
public class GetEmployeeListOnDesignationController {

    @Autowired
    private GetEmployeeListDesignationService getEmployeeListDesignationService;

    @RequestMapping("/getEmployeeListBasedOnDesignation/{designation}")
    public EmployeeDetails getEmployeeListBasedOnDesignation(@PathVariable("designation") String designation){
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployees(getEmployeeListDesignationService.getEmployeeListDesignation(designation));
        return employeeDetails;
    }
}

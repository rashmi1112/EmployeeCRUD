package io.EmployeeOrchestration.EmployeeOrchestration.service;

import io.EmployeeOrchestration.EmployeeOrchestration.dao.GetEmployeeListDesignationImpl;
import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetEmployeeListDesignationService {

    @Autowired
    GetEmployeeListDesignationImpl getEmployeeListDesignation;

    public List<Employee> getEmployeeListDesignation(String designation) {
        return getEmployeeListDesignation.getEmployeesBasedOnDesignation(designation);
    }
}

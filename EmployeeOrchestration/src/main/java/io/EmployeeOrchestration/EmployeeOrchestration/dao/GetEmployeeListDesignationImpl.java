package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import io.EmployeeOrchestration.EmployeeOrchestration.resource.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class GetEmployeeListDesignationImpl implements GetEmployeeListDesignation{


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getEmployeesBasedOnDesignation(String designation) {

        ResponseEntity<EmployeeDetails> response = restTemplate.getForEntity("http://employee-crud-service/getEmployeesData",  EmployeeDetails.class);
        EmployeeDetails employeeDetails = response.getBody();
        assert employeeDetails != null;
        List<Employee> employees = employeeDetails.getEmployees();

        return employees.stream().filter(emp->emp.getDesignation().equalsIgnoreCase(designation)).collect(Collectors.toList());

        }

    }

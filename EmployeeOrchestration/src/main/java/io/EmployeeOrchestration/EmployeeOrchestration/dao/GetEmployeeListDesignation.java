package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;

import java.util.List;

public interface GetEmployeeListDesignation {
        List<Employee> getEmployeesBasedOnDesignation(String designation);
}

package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.http.ResponseEntity;

public interface UpdateEmployeeRecord {
    String updateEmployeeRecord(Employee emp, int id);
}

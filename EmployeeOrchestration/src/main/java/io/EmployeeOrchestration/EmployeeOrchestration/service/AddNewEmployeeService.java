package io.EmployeeOrchestration.EmployeeOrchestration.service;

import io.EmployeeOrchestration.EmployeeOrchestration.dao.AddNewEmployeeImpl;
import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddNewEmployeeService {

    @Autowired
    AddNewEmployeeImpl addNewEmployee;

    public int addNewEmployee(Employee emp){
        return addNewEmployee.addNewEmployee(emp);
    }
}

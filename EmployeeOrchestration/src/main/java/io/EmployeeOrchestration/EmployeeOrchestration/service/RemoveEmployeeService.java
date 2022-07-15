package io.EmployeeOrchestration.EmployeeOrchestration.service;

import io.EmployeeOrchestration.EmployeeOrchestration.dao.RemoveEmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveEmployeeService {

    @Autowired
    RemoveEmployeeImpl removeEmployee;

    public String removeEmployee(int id){
        return removeEmployee.removeEmployee(id);
    }

}

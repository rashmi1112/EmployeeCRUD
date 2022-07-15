package io.EmployeeOrchestration.EmployeeOrchestration.service;

import io.EmployeeOrchestration.EmployeeOrchestration.dao.UpdateEmployeeRecordImpl;
import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployeeRecordService {
    @Autowired
    UpdateEmployeeRecordImpl updateEmployeeRecord;

    public String updateEmployeeRecord(Employee emp, int id){
        return updateEmployeeRecord.updateEmployeeRecord(emp, id);
    }
}

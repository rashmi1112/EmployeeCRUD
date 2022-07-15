package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class RemoveEmployeeImpl implements RemoveEmployeeDao {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String removeEmployee(int id) {
        restTemplate.delete("http://employee-crud-service/DeleteEmployeeRecord/" + id);
        return "Employee removed successfully!";
    }
}

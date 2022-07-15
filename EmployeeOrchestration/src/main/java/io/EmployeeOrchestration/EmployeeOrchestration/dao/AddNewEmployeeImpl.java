package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class AddNewEmployeeImpl implements AddNewEmployee{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public int addNewEmployee(Employee emp) {
        Integer value = restTemplate.postForObject("http://employee-crud-service/insertIntoEmployeeTable", emp, Integer.TYPE);
        if (value != null){
            return value;
        }
        return 0;
    }
}

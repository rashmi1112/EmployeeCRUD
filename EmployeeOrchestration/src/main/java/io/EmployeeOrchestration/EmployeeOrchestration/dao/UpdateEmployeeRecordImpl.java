package io.EmployeeOrchestration.EmployeeOrchestration.dao;

import io.EmployeeOrchestration.EmployeeOrchestration.resource.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Repository
public class UpdateEmployeeRecordImpl implements UpdateEmployeeRecord{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String updateEmployeeRecord(Employee emp, int id) {
        ResponseEntity<Employee> response = restTemplate.getForEntity("http://employee-crud-service/getEmployeesData/" + id,  Employee.class);
        Employee employee = response.getBody();
        assert (employee != null);
        if (employee.getDepartment().equalsIgnoreCase("sales")){
            return "Cannot update the employee in Sales Department";
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Employee> requestUpdate = new HttpEntity<>(emp, headers);
        ResponseEntity<Integer> responsePut = restTemplate.exchange("http://employee-crud-service/updateEmployeeRecord/" + id, HttpMethod.PUT,requestUpdate, Integer.TYPE);
        return Objects.requireNonNull(responsePut.getBody()) + "No. rows updated!";

    }
}

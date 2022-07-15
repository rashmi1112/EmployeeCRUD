package io.EmployeeCRUD.EmployeeCRUDService.dao;


import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDataDaoImpl implements EmployeeDataDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getEmployees() {
        String sqlQuery = "select * from employee";
        List<Employee> empData;
        empData = jdbcTemplate.query(sqlQuery, this::mapRowToEmployee);
        return empData;
    }

    private Employee mapRowToEmployee(ResultSet resultSet, int rowNum) throws SQLException {
        return Employee.builder()
                .empId(resultSet.getString("EmployeeID"))
                .firstName(resultSet.getString("FirstName"))
                .lastName(resultSet.getString("LastName"))
                .addressLine1(resultSet.getString("AddressLine1"))
                .addressLine2(resultSet.getString("AddressLine2"))
                .city(resultSet.getString("City"))
                .state(resultSet.getString("State"))
                .country(resultSet.getString("Country"))
                .zipcode(resultSet.getString("Zipcode"))
                .salary(resultSet.getDouble("Salary"))
                .department(resultSet.getString("Department"))
                .designation(resultSet.getString("Designation"))
                .build();
    }
}

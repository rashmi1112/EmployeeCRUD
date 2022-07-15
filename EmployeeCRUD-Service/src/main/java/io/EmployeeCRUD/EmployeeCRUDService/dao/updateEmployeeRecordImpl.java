package io.EmployeeCRUD.EmployeeCRUDService.dao;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class updateEmployeeRecordImpl implements updateEmployeeRecord {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int updateEmployeeRecord(Employee emp, int id) {
        String sqlQuery = "update EmployeeSchema.employee set FirstName = ?, LastName = ?, AddressLine1 = ?, AddressLine2 = ?, City = ?, State = ?, Country = ?, Zipcode = ?, Salary = ?, Department = ?, Designation = ? where EmployeeID = ?";

        Object args[] = {emp.getFirstName(), emp.getLastName(), emp.getAddressLine1(), emp.getAddressLine2(), emp.getCity(), emp.getState(), emp.getCountry(), emp.getZipcode(), emp.getSalary(), emp.getDepartment(), emp.getDesignation(), id};
        int noOfRowsInserted = jdbcTemplate.update(sqlQuery, args);
        System.out.println("No. of rows inserted " + noOfRowsInserted);
        return noOfRowsInserted;

    }
}

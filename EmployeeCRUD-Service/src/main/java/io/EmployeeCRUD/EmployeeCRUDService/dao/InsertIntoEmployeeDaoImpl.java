package io.EmployeeCRUD.EmployeeCRUDService.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertIntoEmployeeDaoImpl implements InsertIntoEmployeeDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertIntoEmployee(int EmployeeID, String FirstName, String LastName, String AddressLine1, String AddressLine2, String City, String State, String Country, String Zipcode, Double Salary, String Department, String Designation) {
        String sqlQuery = "insert into EmployeeSchema.employee (EmployeeID, FirstName, LastName, AddressLine1, AddressLine2, City, State, Country, Zipcode, Salary, Department, Designation) values " +
                "(?,?,?,?,?,?,?,?,?,?,?,?)";

        Object arg[] = {EmployeeID, FirstName, LastName, AddressLine1, AddressLine2, City, State, Country, Zipcode, Salary, Department, Designation};
        int noOfRowsInserted = jdbcTemplate.update(sqlQuery, arg);
        System.out.println("No. of rows inserted " + noOfRowsInserted);
        return noOfRowsInserted;
        }
    }

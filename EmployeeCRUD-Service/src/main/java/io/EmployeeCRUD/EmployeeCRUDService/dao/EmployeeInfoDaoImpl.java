package io.EmployeeCRUD.EmployeeCRUDService.dao;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import io.EmployeeCRUD.EmployeeCRUDService.exceptions.UserNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public class EmployeeInfoDaoImpl implements EmployeeInfoDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Employee> getById(int empId) {
        String sqlQuery = "select EmployeeID, FirstName, LastName, AddressLine1, AddressLine2, City, State, Country, Zipcode, Salary, Department, Designation " +
                "from Employee where EmployeeID = ?";
        try{
            return jdbcTemplate.queryForObject(sqlQuery, (rs, rowNum) -> Optional.of(mapRowToEmployee(rs)), empId);
        }catch (EmptyResultDataAccessException e){
            return Optional.empty();
        }

        //        if (emp == null){
//            System.out.println("Exception here");
//            throw new UserNotFoundException("User Not Found with id: " + empId);
//        }


    }

    private Employee mapRowToEmployee(ResultSet resultSet) throws SQLException {
//        if (resultSet == null){
//            System.out.println("Exception here");
//            throw new UserNotFoundException("User Not Found with id:");
//        }
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

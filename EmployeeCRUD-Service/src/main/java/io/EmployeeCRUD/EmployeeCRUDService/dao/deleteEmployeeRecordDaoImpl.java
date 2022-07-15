package io.EmployeeCRUD.EmployeeCRUDService.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class deleteEmployeeRecordDaoImpl implements deleteEmployeeRecordDao{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void deleteEmployeeRecord(int id) {
        String sqlQuery = "delete from EmployeeSchema.employee where EmployeeID = ?";
        int noOfRowsInserted = jdbcTemplate.update(sqlQuery, id);
        System.out.println("No. of rows inserted " + noOfRowsInserted);
    }
}

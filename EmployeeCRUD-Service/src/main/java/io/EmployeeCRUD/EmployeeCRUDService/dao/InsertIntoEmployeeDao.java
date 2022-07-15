package io.EmployeeCRUD.EmployeeCRUDService.dao;

public interface InsertIntoEmployeeDao {
    int insertIntoEmployee(int EmployeeID, String FirstName, String LastName, String AddressLine1, String AddressLine2, String City, String State, String Country, String Zipcode, Double Salary, String Department, String Designation);
}

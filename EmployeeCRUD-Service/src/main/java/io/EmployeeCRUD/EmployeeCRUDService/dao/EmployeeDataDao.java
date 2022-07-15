package io.EmployeeCRUD.EmployeeCRUDService.dao;

import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;

import java.util.List;

public interface EmployeeDataDao {
    List<Employee> getEmployees();
}

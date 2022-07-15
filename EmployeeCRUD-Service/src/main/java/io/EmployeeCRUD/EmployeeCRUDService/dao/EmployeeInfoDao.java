package io.EmployeeCRUD.EmployeeCRUDService.dao;


import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;

import java.util.Optional;

public interface EmployeeInfoDao {
    Optional<Employee> getById(int empId);
}

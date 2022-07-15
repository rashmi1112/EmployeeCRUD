package io.EmployeeCRUD.EmployeeCRUDService.entity;

import java.util.List;

public class EmployeeDetails {
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private List<Employee> employees;


}

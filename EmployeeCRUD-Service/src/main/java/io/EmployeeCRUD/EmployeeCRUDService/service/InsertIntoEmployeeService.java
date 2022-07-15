package io.EmployeeCRUD.EmployeeCRUDService.service;

import io.EmployeeCRUD.EmployeeCRUDService.dao.InsertIntoEmployeeDaoImpl;
import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class InsertIntoEmployeeService {
    @Autowired
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    InsertIntoEmployeeDaoImpl employeeInfoDao = context.getBean("insertIntoEmployeeDao", InsertIntoEmployeeDaoImpl.class);


    public int insertEmployee(Employee emp) {
        if (emp == null){
            System.out.println("Here Null");
        }
        int new_empId = Integer.parseInt(emp.getEmpId());
        return employeeInfoDao.insertIntoEmployee(new_empId, emp.getFirstName(), emp.getLastName(), emp.getAddressLine1(), emp.getAddressLine2(), emp.getCity(), emp.getState(), emp.getCountry(), emp.getZipcode(), emp.getSalary(), emp.getDepartment(), emp.getDesignation());
//        employeeInfoDao.insertIntoEmployee(values);
    }
}

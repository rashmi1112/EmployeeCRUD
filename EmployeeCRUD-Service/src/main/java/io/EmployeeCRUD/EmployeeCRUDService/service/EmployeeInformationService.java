package io.EmployeeCRUD.EmployeeCRUDService.service;


import io.EmployeeCRUD.EmployeeCRUDService.dao.EmployeeInfoDaoImpl;
import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeInformationService {

    @Autowired
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    EmployeeInfoDaoImpl employeeInfoDao = context.getBean("employeeDao", EmployeeInfoDaoImpl.class);


    public Optional<Employee> getEmployeeDetails(String empId) {
        int new_empId = Integer.parseInt(empId);
        Optional<Employee> emp = employeeInfoDao.getById(new_empId);
//        System.out.println(emp);
        return emp;
    }
}


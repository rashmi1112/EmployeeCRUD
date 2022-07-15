package io.EmployeeCRUD.EmployeeCRUDService.service;

import io.EmployeeCRUD.EmployeeCRUDService.dao.EmployeeDataDaoImpl;
import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDataService {

    @Autowired
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    EmployeeDataDaoImpl employeeDataDao = context.getBean("employeeDataDao", EmployeeDataDaoImpl.class);

    public List<Employee> getEmployeeRecords(){
        return employeeDataDao.getEmployees();
    }
}

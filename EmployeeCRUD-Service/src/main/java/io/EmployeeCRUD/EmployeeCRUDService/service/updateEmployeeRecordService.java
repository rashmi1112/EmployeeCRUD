package io.EmployeeCRUD.EmployeeCRUDService.service;

import io.EmployeeCRUD.EmployeeCRUDService.dao.updateEmployeeRecordImpl;
import io.EmployeeCRUD.EmployeeCRUDService.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class updateEmployeeRecordService {
    @Autowired
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    updateEmployeeRecordImpl updateEmployeeRecord = context.getBean("updateEmployeeRecordDao", updateEmployeeRecordImpl.class);

    public int updateEmployeeRecord(Employee emp, int id) {
        return updateEmployeeRecord.updateEmployeeRecord(emp, id);
    }
}

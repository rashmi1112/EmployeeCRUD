package io.EmployeeCRUD.EmployeeCRUDService.service;

import io.EmployeeCRUD.EmployeeCRUDService.dao.deleteEmployeeRecordDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class deleteEmployeeRecordService {

    @Autowired
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    deleteEmployeeRecordDaoImpl deleteEmployeeRecord = context.getBean("deleteEmployeeRecordDao", deleteEmployeeRecordDaoImpl.class);

    public void deleteEmployeeRecord( int id) {
        deleteEmployeeRecord.deleteEmployeeRecord(id);
    }
}

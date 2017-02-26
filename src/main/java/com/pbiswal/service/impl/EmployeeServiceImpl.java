package com.pbiswal.service.impl;

import com.pbiswal.dao.EmployeeDao;
import com.pbiswal.entity.Employee;
import com.pbiswal.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    @Qualifier("fakeData")
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees(){
        return this.employeeDao.getAllEmployees();
    }

    public Employee getEmployeeById(int id){
        return this.employeeDao.getEmployeeById(id);
    }


    public void removeEmployeeById(int id) {
        this.employeeDao.removeEmployeeById(id);
    }

    public void updateEmployee(Employee employee){
        this.employeeDao.updateEmployee(employee);
    }

    public void insertEmployee(Employee employee) {
        this.employeeDao.insertEmployeeToDb(employee);
    }


}

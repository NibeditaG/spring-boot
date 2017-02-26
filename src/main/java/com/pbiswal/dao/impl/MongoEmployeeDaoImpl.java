package com.pbiswal.dao.impl;

import com.pbiswal.dao.EmployeeDao;
import com.pbiswal.entity.Employee;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mongoData")
public class MongoEmployeeDaoImpl implements EmployeeDao
{


    @Override
    public Collection<Employee> getAllEmployees() {
        return new ArrayList<Employee>(){
            {
                add(new Employee(1, "Mario", "Sales"));
            }
        };
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public void removeEmployeeById(int id) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void insertEmployeeToDb(Employee employee) {

    }
}
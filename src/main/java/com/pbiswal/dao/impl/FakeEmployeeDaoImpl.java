package com.pbiswal.dao.impl;

import com.pbiswal.dao.EmployeeDao;
import com.pbiswal.entity.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("fakeData")
public class FakeEmployeeDaoImpl implements EmployeeDao
{

    private static Map<Integer, Employee> employeeMap;

    static {

        employeeMap = new HashMap<Integer, Employee>(){

            {
                put(1, new Employee(1, "Said", "Customer Support"));
                put(2, new Employee(2, "Alex U", "Finance"));
                put(3, new Employee(3, "Anna", "Admin"));
            }
        };
    }

    @Override
    public Collection<Employee> getAllEmployees(){
        return this.employeeMap.values();
    }

    @Override
    public Employee getEmployeeById(int id){
        return this.employeeMap.get(id);
    }

    @Override
    public void removeEmployeeById(int id) {
        this.employeeMap.remove(id);
    }

    @Override
    public void updateEmployee(Employee employee){
        Employee s = employeeMap.get(employee.getId());
        s.setDept(employee.getDept());
        s.setName(employee.getName());
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void insertEmployeeToDb(Employee employee) {
        this.employeeMap.put(employee.getId(), employee);
    }
}
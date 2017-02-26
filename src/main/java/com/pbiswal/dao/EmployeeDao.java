package com.pbiswal.dao;

import com.pbiswal.entity.Employee;

import java.util.Collection;

public interface EmployeeDao
{
    Collection<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    void removeEmployeeById(int id);

    void updateEmployee(Employee employee);

    void insertEmployeeToDb(Employee employee);
}
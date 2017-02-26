package com.pbiswal.service;

import com.pbiswal.entity.Employee;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService
{
    public Collection<Employee> getAllEmployees();

    public Employee getEmployeeById(int id);

    public void removeEmployeeById(int id);

    public void updateEmployee(Employee employee);

    public void insertEmployee(Employee employee);
}

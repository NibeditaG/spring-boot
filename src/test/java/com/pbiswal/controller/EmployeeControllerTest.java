package com.pbiswal.controller;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import com.pbiswal.entity.Employee;
import com.pbiswal.service.EmployeeService;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest
{
    @InjectMocks
    EmployeeController employeeController;

    @Mock
    EmployeeService employeeService;

    @Test
    public void testGetAllEmployees()
    {
       doReturn(new ArrayList<>()).when(employeeService).getAllEmployees();
        employeeController.getAllEmployees();
        verify(employeeService,times(1)).getAllEmployees();
    }

    @Test
    public void testGetEmployeeById()
    {
        doReturn(new Employee()).when(employeeService).getEmployeeById(anyInt());
        employeeController.getEmployeeById(1);
        verify(employeeService, times(1)).getEmployeeById(anyInt());
    }

    @Test
    public void testDeleteEmployeeById()
    {
        doNothing().when(employeeService).removeEmployeeById(anyInt());
        employeeController.deleteEmployeeById(1);
        verify(employeeService, times(1)).removeEmployeeById(anyInt());
    }

    @Test
    public void testInsertEmployee()
    {
        doNothing().when(employeeService).insertEmployee(any());
        employeeController.insertEmployee(new Employee());
        verify(employeeService, times(1)).insertEmployee(any());
    }
}

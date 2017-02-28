package com.pbiswal.dao.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import com.pbiswal.entity.Employee;
import com.pbiswal.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoEmployeeDaoImplTest
{
    @InjectMocks
    MongoEmployeeDaoImpl mongoEmployeeDao;

    @Test
    public void testGetAllEmployees()
    {
        Collection<Employee> allEmployees = mongoEmployeeDao.getAllEmployees();
        Assert.assertEquals(allEmployees.isEmpty(),equals(false));
        Assert.assertEquals(allEmployees.isEmpty(),equals(false));
    }
}

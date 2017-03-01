package com.nsahoo;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nibedita on 2/27/2017.
 */
public class EmpTest {

    public static void main(String args[])
    {
        Employee e1=new Employee(1,"Hari",26,"Bangalore");
        Employee e2=new Employee(2,"Ritesh",27,"kolkata");
        Employee e3=new Employee(3,"Akshaya",24,"Mumbai");
        Employee e4=new Employee(4,"Govind",25,"Chennai");
        Employee e5=new Employee(5,"Rajesh",23,"Hyderabad");


        List<Employee> employees= new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        List<Employee> list1= new ArrayList<>(employees);
        List<Employee> list2= new ArrayList<>(employees);

        System.out.println("Compare by name :");
//        list1.sort((emp1,emp2) -> emp1.getName().compareTo(emp2.getName()));
        list1.sort(comparing(Employee::getName));
        System.out.println(list1);
        System.out.println("Compare by id :");
        list2.sort(comparing(Employee::getId));
        System.out.println(list2);
    }
}

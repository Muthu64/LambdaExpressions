package com.demo.java8.functionInterfaces;

import com.demo.java8.DTO.Employee;

import java.util.function.Consumer;

public class EmployeeConsumer implements Consumer<Employee>
{
    @Override
    public void accept( Employee employee )
    {
        employee.toString();
        System.out.println( "Employee object inside consumer-->" + employee );
    }
}

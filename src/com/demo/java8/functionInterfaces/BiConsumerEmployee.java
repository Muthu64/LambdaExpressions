package com.demo.java8.functionInterfaces;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;

import java.util.function.BiConsumer;

public class BiConsumerEmployee implements BiConsumer<Employee, FunctionReturnEmployee>
{
    @Override
    public void accept( Employee employee, FunctionReturnEmployee functionReturnEmployee )
    {
        System.out.println(employee);
        System.out.println(functionReturnEmployee);
    }
}

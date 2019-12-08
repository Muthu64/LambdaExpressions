package com.demo.java8.Function.Interface;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;

import java.util.function.Function;

/*
* This is a custom function and this implements Function interface and it accepts two arguments,
* 1st - Type of argument, 2nd - Return type, it had apply method in it
*/
public class EmployeeFunction implements Function<Employee, FunctionReturnEmployee>
{
    @Override
    public FunctionReturnEmployee apply( Employee employee )
    {
        return new FunctionReturnEmployee( employee.getName() );
    }
}

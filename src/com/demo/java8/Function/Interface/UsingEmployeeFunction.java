package com.demo.java8.Function.Interface;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;

public class UsingEmployeeFunction
{
    public static void main( String[] args )
    {
        Employee employee = new Employee( 1, "dhinesh", Employee.RoleEnum.MECHANICAL_ENGINEER, 50000.00 );

        FunctionReturnEmployee functionReturnEmployee = new EmployeeFunction().apply( employee );
        System.out.println(functionReturnEmployee);
    }
}

package com.demo.java8.streams;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaClass
{

    public static void main( String[] args )
    {
        LambdaClass lambdaClass = new LambdaClass();

        Predicate<Employee> employeePredicate = ( employee ) ->
        {
            return employee.getRole() == Employee.RoleEnum.SOFTWARE_ENGINEER;
        };

        Function<Employee, FunctionReturnEmployee> employeeFunction = employee->{
            return new FunctionReturnEmployee( "" );
        };

        FunctionReturnEmployee functionReturnEmployee = employeeFunction.apply( new Employee( "" ) );
        employeePredicate.test( new Employee( "" ) );

        lambdaClass.test();
        lambdaClass.testString( "balaganesh" );
    }

    public String test()
    {
        return "bala";
    }


    public String testString(String str)
    {
        return str;
    }
}



package com.demo.java8.Function;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;
import com.demo.java8.Function.Interface.EmployeeFunction;
import com.demo.java8.Function.Interface.TestBiFunction;

public class ClassUsingCustomFunction
{
    public static void main( String[] args )
    {
        ClassUsingCustomFunction classUsingCustomFunction = new ClassUsingCustomFunction();
        classUsingCustomFunction.executeExample1();
        classUsingCustomFunction.executeExample2();
    }

    public void executeExample1()
    {
        FunctionReturnEmployee functionReturnEmployee = new EmployeeFunction().apply( new Employee( 1, "Muthu", Employee.RoleEnum.SOFTWARE_ENGINEER, 5000.00 ) );
        System.out.println( functionReturnEmployee );
    }

    public void executeExample2()
    {
       // Integer result = new TestBiFunction().apply( 5, 2 );
        //System.out.println( "result from example 2==>" + result );

    }
}

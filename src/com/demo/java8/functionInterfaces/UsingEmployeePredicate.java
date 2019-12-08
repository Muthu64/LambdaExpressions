package com.demo.java8.functionInterfaces;

import com.demo.java8.DTO.Employee;

import java.util.function.Predicate;

public class UsingEmployeePredicate
{
    public static void main( String[] args )
    {
        Employee employee = new Employee( 1, "dhinesh", Employee.RoleEnum.MECHANICAL_ENGINEER, 50000.00 );

        /*Predicate<Employee> employeePredicate = employee1 ->
        {
            return employee1.getRole() == Employee.RoleEnum.SOFTWARE_ENGINEER;
        };*/
        System.out.println( new EmployeePredicate().test( employee ) );
    }
}
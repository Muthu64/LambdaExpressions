package com.demo.java8.functionInterfaces;

import com.demo.java8.DTO.Employee;

import java.util.function.Predicate;

public class EmployeePredicate implements Predicate<Employee>
{
    @Override
    public boolean test( Employee employee )
    {
        return employee.getRole().equals( Employee.RoleEnum.SOFTWARE_ENGINEER );
    }
}

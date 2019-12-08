package com.demo.java8;

import com.demo.java8.DTO.Employee;
import com.demo.java8.interfaces.EmployeeInterface;

public class EmployeeImplementation implements EmployeeInterface
{
    @Override
    public Employee retrieveEmployee( int id )
    {
        return new Employee( id, "Muthu", Employee.RoleEnum.SOFTWARE_ENGINEER, 5000.00 );
    }
}

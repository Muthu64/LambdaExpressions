package com.demo.java8.supplier;

import com.demo.java8.DTO.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface implements Supplier<List<Employee>>
{
    @Override
    public List<Employee> get()
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee( 1, "Muthu", Employee.RoleEnum.SOFTWARE_ENGINEER, 5000.00 ) );
        employeeList.add( new Employee( 2, "Kumar", Employee.RoleEnum.SOFTWARE_ENGINEER, 2000.00 ) );
        employeeList.add( new Employee( 3, "Saravanan", Employee.RoleEnum.MECHANICAL_ENGINEER, 55000.00 ) );
        employeeList.add( new Employee( 4, "Bala ganesh", Employee.RoleEnum.SOFTWARE_ENGINEER, 25000.00 ) );
        employeeList.add( new Employee( 5, "Hari", Employee.RoleEnum.ELECTICAL_ENGINEER, 500000.20 ) );
        return employeeList;
    }
}

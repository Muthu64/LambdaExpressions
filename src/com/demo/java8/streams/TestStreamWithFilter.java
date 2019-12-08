package com.demo.java8.streams;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;
import com.demo.java8.Function.Interface.EmployeeFunction;
import com.demo.java8.functionInterfaces.EmployeeConsumer;
import com.demo.java8.functionInterfaces.EmployeePredicate;
import com.demo.java8.interfaces.FunctionalInterfaceViolationChecks;
import com.demo.java8.supplier.SupplierInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamWithFilter
{
    public static void main( String[] args )
    {
        TestStreamWithFilter testStreamWithFilter = new TestStreamWithFilter();
        List<Employee> employeeList = new SupplierInterface().get();

        FunctionalInterfaceViolationChecks functionalInterfaceViolationChecks = () ->
        {
            System.out.println( "method implementation for FIMethod1" );
        };

        functionalInterfaceViolationChecks.FIMethod1();

        employeeList.forEach( listValue -> System.out.println( "list value before filter->" + listValue ) );

        System.out.println( "===============================" );
        employeeList = employeeList.stream().filter( listValue -> listValue.getRole().equals( Employee.RoleEnum.SOFTWARE_ENGINEER ) ).collect( Collectors.toList() );
        employeeList.forEach( listValue -> System.out.println( "list value after filter->" + listValue ) );

        //Using Employee Consumer here
        System.out.println( "---------------Using Employee Consumer here---------------" );
        testStreamWithFilter.clearEmployeeListObject( employeeList );
        employeeList = new SupplierInterface().get();
        employeeList.forEach( new EmployeeConsumer() );

        System.out.println( "employee with all match-->" + employeeList.stream().allMatch( new EmployeePredicate() ) );
        //Using custom predicate to filter things out
        System.out.println( "---------------Using Custom Predicate here---------------" );
        testStreamWithFilter.clearEmployeeListObject( employeeList );
        employeeList = new SupplierInterface().get();
        employeeList = employeeList.stream().filter( new EmployeePredicate() ).collect( Collectors.toList() );
        employeeList.forEach( new EmployeeConsumer() );

        System.out.println( "employee with any match-->" + employeeList.stream().anyMatch( new EmployeePredicate() ) );

        employeeList = employeeList.stream().filter( new EmployeePredicate() ).map( employee -> new Employee( employee.getRollNumber(), employee.getName(), Employee.RoleEnum.MECHANICAL_ENGINEER, employee.getSalary() ) ).collect( Collectors.toList() );

        employeeList.forEach( new EmployeeConsumer() );

        List<FunctionReturnEmployee> FunctionReturnEmployee = employeeList.stream().filter( new EmployeePredicate() ).map( new EmployeeFunction() ).collect( Collectors.toList() );
        FunctionReturnEmployee.forEach( i ->
        {
            System.out.println( i );
        } );

        Employee e = employeeList.stream().findFirst().orElseGet( () -> new Employee( 1, "", Employee.RoleEnum.SOFTWARE_ENGINEER, 0.0 ) );
        System.out.println( e );

        List<Employee.RoleEnum> ads= employeeList.stream().map( x->x.getRole() ).collect( Collectors.toList() );
        employeeList.stream().map( new EmployeeFunction() ).collect( Collectors.toList()).forEach( i-> System.out.println(i) );

        employeeList.stream().flatMap( i-> Stream.of(i) ).collect( Collectors.toList()).forEach( i-> System.out.println(i) );

        Collections.sort( employeeList, (i,i2)->i.getName().compareTo( i2.getName() ) );


        Map<Integer,Employee> integerEmployeeMap = new HashMap<>(  );

        integerEmployeeMap.entrySet().stream().map( (entrySet)->entrySet.getValue() ).collect( Collectors.toList() );
        integerEmployeeMap.entrySet().stream().map( Map.Entry::getValue).collect( Collectors.toList() );
    }

    public void clearEmployeeListObject( List<Employee> employeeList )
    {
        employeeList.clear();
    }

}

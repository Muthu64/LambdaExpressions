package com.demo.java8.streams;

import com.demo.java8.DTO.Employee;
import com.demo.java8.DTO.FunctionReturnEmployee;
import com.demo.java8.supplier.SupplierInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2
{

    public String testMethod(Employee e )
    {
        return "";
    }

    public static void main( String[] args )
    {

        List<FunctionReturnEmployee> functionReturnEmployees = new ArrayList<>(  );

        functionReturnEmployees.stream().map( FunctionReturnEmployee :: getReturnEmployeeName);
        SupplierInterface supplierInterface = new SupplierInterface();
        List<Employee> employeeList = supplierInterface.get();

        //Convert List<Employee>  to List<String>
        Stream2 sobj = new Stream2();

        employeeList.stream().map( sobj::testMethod );

        List<String> stringList = employeeList.stream().filter( i -> i.getRole().equals( Employee.RoleEnum.SOFTWARE_ENGINEER ) ).map( Employee::getName ).collect( Collectors.toList() );
        System.out.println( stringList );

        //convert List<Employee> to Map<Employee>
        Map<Integer, Employee> integerEmployeeMap = employeeList.stream().collect( Collectors.toMap( Employee::getRollNumber, Function.identity() ) );
        for ( Map.Entry<Integer, Employee> integerEmployeeEntry : integerEmployeeMap.entrySet() )
        {
            System.out.println( "key--->" + integerEmployeeEntry.getKey() );
            System.out.println( "value--->" + integerEmployeeEntry.getValue() );
        }

        //Convert Map values to list<Employees>

        List<Employee> employees = integerEmployeeMap.entrySet().stream().map( i -> i.getValue() ).collect( Collectors.toList() );
        employees.forEach( i -> System.out.println( i ) );

        //Convert List<Employees> to set<String>
        Set<Employee.RoleEnum> roleEnums = employees.stream().map( Employee::getRole ).collect( Collectors.toSet() );
        roleEnums.forEach( i -> System.out.println( i ) );

        //Convert
        employeeList.stream().limit( 2 ).collect( Collectors.toList() ).forEach( i -> System.out.println( i ) );

        //Using comparator
        List<Employee> employees1 = employeeList.stream().sorted( Comparator.comparing( Employee::getName ) ).collect( Collectors.toList() );
        System.out.println( employees1 );


        //concatenating string inside a list
        String longString = employeeList.stream().map( Employee::getName ).collect( Collectors.joining( "," ) );

        stringList.stream().reduce( ( s1, s2 ) -> s1 + "-" + s2 ).get();
        System.out.println( longString );

        Employee e = employeeList.stream().reduce( ( employee1, employee2 ) -> employee1.getSalary() > employee2.getSalary() ? employee1 : employee2 ).get();
        System.out.println( e );

        Double aDouble = employeeList.stream().mapToDouble( Employee::getSalary ).sum();

        Employee emp = employeeList.stream().reduce( ( e1, e2 ) -> e1.getSalary() > e2.getSalary() ? e1 : e2 ).get();
        System.out.println( emp );
        System.out.println( aDouble );

        System.out.println( stringList.stream().reduce( ( s1, s2 ) -> s1.length() > s2.length() ? s1 : s2 ).get() );

        Double average = employeeList.stream().collect( Collectors.averagingDouble( p -> p.getSalary() ) );


        String google = stringList.stream().reduce( ( a, b ) -> a.equals( "Muthu" ) ? a : b ).get();
        System.out.println( google );

        String longoooooooo = employeeList.stream().map( Employee::getName ).reduce( ( string1, string2 ) -> string1.concat( string2 ) ).get();
        System.out.println( longoooooooo );

        String empWithSmallName = employeeList.stream().map( Employee::getName ).reduce( ( s1, s2 ) -> s1.length() < s2.length() ? s1 : s2 ).get();
        System.out.println( empWithSmallName );

        List<Employee> convertedMapToList = integerEmployeeMap.entrySet().stream().map( Map.Entry::getValue ).collect( Collectors.toList() );
        System.out.println( convertedMapToList );

        stringList.stream().reduce( ( ( s, s2 ) -> s.concat( s2 ) ) ).get();

        employeeList.stream().reduce( ( e1, e2 ) -> e1.getSalary() > e2.getSalary() ? e1 : e2 ).get();

    }
}

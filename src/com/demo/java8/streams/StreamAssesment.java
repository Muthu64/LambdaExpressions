package com.demo.java8.streams;

import com.demo.java8.DTO.Employee;
import com.demo.java8.supplier.SupplierInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAssesment
{
    public static void main( String[] args )
    {
        SupplierInterface supplierInterface = new SupplierInterface();
        List<String> stringList = new ArrayList<>();
        Map<Integer, Employee> employeeMap = null;
        List<Employee> employeeList = supplierInterface.get();


        //Convert List<Employee>  to List<String>
        stringList = employeeList.stream().map( Employee::getName ).collect( Collectors.toList() );
        System.out.println( "Convert List<Employee>  to List<String>---" + stringList );

        List<Employee> testingMethodReference = stringList.stream().map( Employee::new ).collect( Collectors.toList() );

        //convert List<Employee> to Map<Employee>
        employeeMap = employeeList.stream().collect( Collectors.toMap( Employee::getRollNumber, Function.identity() ) );
        System.out.println( "convert List<Employee> to Map<Employee>---" + employeeMap );


        //Convert Map values to list<Employees>
        List<Employee> fromMapConvertedEmployeeList = employeeMap.entrySet().stream().map( i -> i.getValue() ).collect( Collectors.toList() );
        System.out.println( "Convert Map values to list<Employees>--------" + fromMapConvertedEmployeeList );


        //Convert List<Employees> to set<String>
        Set<Employee.RoleEnum> roleEnumSet = employeeList.stream().map( Employee::getRole ).collect( Collectors.toSet() );
        System.out.println( "Convert List<Employees> to set<String>---" + roleEnumSet );

        //Using comparator
        //Comparator<Employee> employeeComparator = (employee1,employee2)->{return employee1.getName().compareTo( employee2.getName() );};
        List<Employee> sortedEmployeeList = employeeList.stream().sorted( ( e1, e2 ) -> e1.getName().compareTo( e2.getName() ) ).collect( Collectors.toList() );
        System.out.println( "Using comparator---------" + sortedEmployeeList );

        //concatenating string inside a list
        String concatString = employeeList.stream().map( Employee::getName ).reduce( ( s1, s2 ) -> s1.concat( s2 ) ).get();
        System.out.println( "concatenating string inside a list------" + concatString );

        //Find highest salary
        Double highSalary = employeeList.stream().reduce( ( employee1, employee2 ) -> employee1.getSalary() > employee2.getSalary() ? employee1 : employee2 ).map( Employee::getSalary ).get();
        System.out.println( "Find highest salary---" + highSalary );

        //Summing the salary
        Double salarySum = employeeList.stream().map( Employee::getSalary ).reduce( (e1,e2)->e1.doubleValue()+e2.doubleValue() ).get();
        System.out.println(salarySum);


        Double highestSal = employeeList.stream().map( Employee::getSalary ).reduce( ( doubleSal1, doubleSal2 ) ->
        {
            return ( doubleSal1 < doubleSal2 ) ? doubleSal2 : doubleSal1;
        } ).orElseGet( ()-> new Double(0));

        System.out.println("bala ganesh salary-->"+highestSal);
    }
}

package com.demo.java8.DTO;

public class Employee
{
    private int rollNumber;
    private String name;
    private RoleEnum role;
    private Double salary;

    public Employee( String name )
    {
        this.name = name;
    }

    public Employee( int rollNumber, String name, RoleEnum role, Double salary )
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public String getName()
    {
        return name;
    }

    public RoleEnum getRole()
    {
        return role;
    }

    public Double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", salary=" + salary +
                '}';
    }

    public enum RoleEnum
    {
        SOFTWARE_ENGINEER,
        MECHANICAL_ENGINEER,
        ELECTICAL_ENGINEER
    }

    public static String test( FunctionReturnEmployee functionReturnEmployee )
    {
        return "";
    }
}

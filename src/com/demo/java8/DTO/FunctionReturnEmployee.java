package com.demo.java8.DTO;

public class FunctionReturnEmployee
{
    private String returnEmployeeName;

    public FunctionReturnEmployee( String returnEmployeeName )
    {
        this.returnEmployeeName = returnEmployeeName;
    }

    public String getReturnEmployeeName()
    {
        return returnEmployeeName;
    }

    @Override
    public String toString()
    {
        return "FunctionReturnEmployee{" +
                "returnEmployeeName='" + returnEmployeeName + '\'' +
                '}';
    }
}

package com.demo.java8.lombok;

import com.demo.java8.Test;

import java.sql.Connection;

public class TestingLombok implements AutoCloseable
{
    MyFirstLombok myFirstLombok = new MyFirstLombok();

    @Override
    public void close() throws Exception
    {
        Connection connection = null;
        connection.close();
    }


    public static void main( String[] args ) throws Exception
    {
        try( TestingLombok testingLombok = new TestingLombok() )
        {

        }
    }
}

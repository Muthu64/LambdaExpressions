package com.demo.java8;

import java.util.ArrayList;
import java.util.List;

public class TestLambdaWithCollection
{
    public static void main( String[] args )
    {
        List<String> stringList = new ArrayList<>();
        stringList.add( "string1" );
        stringList.add( "string2" );
        stringList.add( "string3" );
        stringList.add( "string4" );
        stringList.add( "string5" );

        stringList.forEach( o ->
        {
            System.out.println( "value of string is--->" + o );
        } );
    }

}

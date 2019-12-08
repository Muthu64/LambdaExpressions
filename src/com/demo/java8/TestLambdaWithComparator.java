package com.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambdaWithComparator
{
    public static void main( String[] args )
    {
        Comparator<String> stringComparator = ( string1, string2 ) ->
        {
            return string1.compareTo( string2 );
        };

        List<String> stringList = new ArrayList<>();
        stringList.add( "google" );
        stringList.add( "microsoft" );
        stringList.add( "agilysys" );
        stringList.add( "facebook" );
        stringList.add( "twitter" );

        stringList.forEach( string ->
        {
            System.out.println( "value before using comparator-->" + string );
        } );
        System.out.println( "====================================" );
        Collections.sort( stringList, stringComparator );

        stringList.forEach( string ->
        {
            System.out.println( "value after using comparator-->" + string );
        } );
    }
}

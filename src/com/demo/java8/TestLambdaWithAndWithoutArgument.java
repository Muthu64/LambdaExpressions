package com.demo.java8;

import com.demo.java8.interfaces.FunctionalInterfaceAddMethod;
import com.demo.java8.interfaces.FunctionalInterfaceWithSingleArgument;
import com.demo.java8.interfaces.TestFunctionalInterface;

import java.util.Objects;

public class TestLambdaWithAndWithoutArgument
{
    public static void main( String[] args )
    {
        TestFunctionalInterface testFunctionalInterface = () ->
        {
            System.out.println( "I am the implementation of do something method" );
        };
        testFunctionalInterface.doSomething();

        FunctionalInterfaceWithSingleArgument functionalInterfaceWithSingleArgument = ( parameter1 ->
        {
            System.out.println( "Single parameter implementation" );
        } );
        functionalInterfaceWithSingleArgument.methodWithSingleParameter( "1st parameter value" );

        FunctionalInterfaceAddMethod functionalInterfaceAddMethod = ( value1, value2 ) ->
        {
            Objects.requireNonNull( value1, "Value 1 cannot be null" );
            Objects.requireNonNull( value2, "Value 2 cannot be null" );
            return value1 + value2;

        };

        int result = functionalInterfaceAddMethod.add( 5, 9 );
        System.out.println( "result is " + result );

    }


}

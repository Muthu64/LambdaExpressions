package com.demo.java8.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceWithSingleArgument
{
    void methodWithSingleParameter( String parameter1 );

    default void methodToCheckViolation( String value1 )
    {

    }
}

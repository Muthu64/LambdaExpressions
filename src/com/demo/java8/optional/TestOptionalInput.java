package com.demo.java8.optional;

import java.util.Optional;

public class TestOptionalInput
{
    public static void main( String[] args )
    {
        final String validValue = "google";
        final String emptyValue = "";
        final String nullValue = null;

        String optionalString = Optional.ofNullable( validValue ).orElse( "EmptyString" );
        System.out.println( optionalString );


        Optional<String>stringOptional2 = Optional.of( emptyValue );
        System.out.println(stringOptional2);

        Optional<String> stringOptional = Optional.ofNullable( emptyValue );
        System.out.println( stringOptional.isPresent() );

        Optional<String> stringOptional1 = Optional.ofNullable( nullValue );
        System.out.println( stringOptional1.get() );


    }


}

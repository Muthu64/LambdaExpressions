package com.demo.java8.Function.Interface;

import java.util.Objects;
import java.util.function.BiFunction;

public class TestBiFunction implements BiFunction<Integer, Integer, String>
{
    @Override
    public String apply( Integer integer1, Integer integer2 )
    {
        Objects.requireNonNull( integer1 );
        Objects.requireNonNull( integer2 );
        return integer1 + integer2 + "";
    }
}

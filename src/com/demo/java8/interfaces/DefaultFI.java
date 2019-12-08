package com.demo.java8.interfaces;

public interface DefaultFI
{
    public default void defaultMethod()
    {
        System.out.println("default method");
    }

    static void testing()
    {

    }

}

package com.demo.java8.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceViolationChecks extends DefaultFI
{
    public static void method2()
    {

    }

    public void FIMethod1();

    public default void method3()
    {

    }

    //public String FIMethod2(); //Commented to avoid compilation error since FI should have only one abstract method in it
}

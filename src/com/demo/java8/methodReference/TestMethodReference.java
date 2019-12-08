package com.demo.java8.methodReference;

import com.demo.java8.interfaces.TestFunctionalInterface;

import java.util.Objects;
import java.util.function.BiFunction;

public class TestMethodReference
{

    private static void doSomething()
    {
        System.out.println( "I am method inside static do something method" );
    }

    private static void threadRunMethod()
    {
        System.out.println( "I am method inside static thread Run method" );
    }

    public static Integer BiFunctionApplyMethod( Integer integer1, Integer integer2 )
    {
        Objects.requireNonNull( integer1 );
        Objects.requireNonNull( integer2 );
        return integer1 + integer2;
    }

    public static void main( String[] args )
    {
        TestMethodReference testMethodReference = new TestMethodReference();
        testMethodReference.executeExample1();
        testMethodReference.executeExample2();
        testMethodReference.executeExample3();
    }

    public Integer BiFunctionNonStaticApplyMethod( Integer integer1, Integer integer2 )
    {
        Objects.requireNonNull( integer1 );
        Objects.requireNonNull( integer2 );
        return integer1 + integer2;
    }

    private void executeExample1()
    {
        //Assigning static method to the reference
        log( "start Executing---", topic.TOPIC1 );
        TestFunctionalInterface testFunctionalInterface = TestMethodReference::doSomething;
        testFunctionalInterface.doSomething();
        log( "End Executing---", topic.TOPIC1 );
    }

    private void executeExample2()
    {
        //Assigning static method to the reference
        log( "start Executing---", topic.TOPIC2 );
        Runnable runnable = TestMethodReference::threadRunMethod;
        Thread thread = new Thread( runnable );
        thread.start();
        log( "Execution complete---", topic.TOPIC2 );

    }

    private void executeExample3()
    {
        //Assigning static method to the reference
        log( "start Executing---", topic.TOPIC3 );
        BiFunction<Integer, Integer, Integer> biFunction = TestMethodReference::BiFunctionApplyMethod;
        System.out.println( biFunction.apply( 5, 10 ) );
        log( "Execution complete---", topic.TOPIC3 );

    }

    private void executeExample4()
    {
        //Assigning static method to the reference
        log( "start Executing---", topic.TOPIC4 );
        BiFunction<Integer, Integer, Integer> biFunction = new TestMethodReference()::BiFunctionNonStaticApplyMethod;
        System.out.println( biFunction.apply( 5, 10 ) );
        log( "Execution complete---", topic.TOPIC4 );

    }

    private void log( String message, TestMethodReference.topic topic )
    {
        System.out.print( message + " " );
        System.out.println( topic.getTopicName() );
    }

    private static enum topic
    {
        TOPIC1( "Assigning static method reference to functional interface method" ),
        TOPIC2( "Creating threads with static Method reference" ),
        TOPIC3( "Creating Function with static Method reference" ),
        TOPIC4( "Creating Function with non static Method reference" );

        String topicName;

        topic( String topicName )
        {
            this.topicName = topicName;
        }

        public String getTopicName()
        {
            return topicName;
        }
    }
}

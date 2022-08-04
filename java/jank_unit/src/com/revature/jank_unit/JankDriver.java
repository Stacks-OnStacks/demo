package com.revature.jank_unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JankDriver {

    public static void main(String[] args) {

        int passed = 0;
        int failed = 0;

        CalculatorTestSuite cts = new CalculatorTestSuite();

        // we are gonna start using Reflection API in java
        // the idea is that we are getting a mirror image of everything on that particular class

        // ? in generics is basically a wildcard
        try {
            Class<?> testSuiteClass = Class.forName("com.revature.jank_unit.CalculatorTestSuite"); // viewing the class

            // enhanced for loop to look at all of the methods on a class
            for(Method classMethod : testSuiteClass.getMethods()){
//                System.out.println(classMethod);
                if(classMethod.isAnnotationPresent(Test.class)){
                    try {
                        classMethod.invoke(testSuiteClass.newInstance());
                        passed++;
                    } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                        e.printStackTrace();
                        failed++;
                    } catch (Exception e){
                        e.printStackTrace();
                        failed++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("Passed: %d %n Failed: %d", passed, failed).println();
        }

    }

    public static void assertThat(boolean conditional) {
        if(!conditional){
            throw new RuntimeException("Assertion not met");
        }
    }
}

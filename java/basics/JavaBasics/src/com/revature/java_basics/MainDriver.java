// package? this keyword defines where the file or class is located
package com.revature.java_basics;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainDriver {
    // shortcuts like psvm or main with intelli-sense is key to efficiency
    public static void main(String[] args) { // The green play button takes on compilation and execution of the java program
        System.out.println("Hello everyone! Good day!");
        System.out.println("sout is this shortcut for System.out.println();");

        // Primitives & VAriables
        // variables - are locations in memory that are given a specific name
        // primitive - is a basic holder of value that can be assigned to a variable
        int classSize; //declared a variable classSize with the datatype of int, 32bit 20000000
        classSize = 24; // assigned the value to class, prior to this it was defaulted to 0
        System.out.println(classSize);

        // primitives
        boolean isTheClassCool = true;
        System.out.println(isTheClassCool);
        System.out.println("Is the class cool? " + isTheClassCool);

        short num1 = 1000; // 16bit ~32000
        byte num2 = 100; // 8 bit ~123
        long num3 = 10000000; // 64bit 900000000000000

        System.out.println(num1); // ctrl + d, shortcut to duplicate line below
        System.out.println(num2);
        System.out.println(num3);

        // ever be a single character, this is based off unicode
        char firstInitial = 'C';
        char secondInitial = 'c'; //cannot put multiple characters inside of ''

        System.out.println(secondInitial);

        // primitives - decimals
        double specificnum = 11.1;
        float floatnum = 11.1f;

        // doubles and floats are nice, if you're not concerned with precision. They round differently

        // Class String
        // immutable - cannot change the value in memory without reassignment
        String bob = "Bob"; // string literal syntax
        String bob2 = new String("Bob"); // this was older syntax
        String bob3 = "Bob";
        System.out.println(bob);
        System.out.println(bob2);
        System.out.println(bob == bob2); // == evaluates memory equivalency
        System.out.println(bob.equals(bob2)); // this evaluates value equivalency
        System.out.println("bob to bob3" + (bob == bob3)); // output: true, this is because they are both in the same memory location
        // That location is known as the STRING POOL

        String charlie = "Charlie";

        // directly reassign the value
        bob = "Chuck";
        System.out.println("bob to bob3, bob now chuck" + (bob == bob3));
        String chuck = "Chuck";
        System.out.println("bob to chuck " + (bob == chuck));
        bob3 = "Dave"; // There are no more Strings reference variables associated with "Bob", garbage collection now takes place

        // Conditionals
        int numb1 = 10;
        int numb2 = 10;

        System.out.println(numb1 == numb2);

        // IF statements
        if (numb1 == numb2) System.out.println("Number 1 equals number 2 ");

        numb2 = 20;
        if (numb1 == numb2) System.out.println("Number 1 does not equal number 2 ");

        int numb3 = 10;

        if (numb1 == numb2) {
            System.out.println("Yea, 1-2 they match");
        } else {
            System.out.println("Woah! This don't line up!");
        }

        if (numb1 == numb3) {
            System.out.println("Yea, 1-3 they match");
        }

        if (10 == 10) {
            System.out.println("10-4 buddy");
        } else {
            // this line will never execute
            System.out.println("Yayyy");
        }

        // any conditional statement can be used inside of the if statement
        if (bob.equals(chuck)) {
            System.out.println("Let's celebrate");
        } else {
            System.out.println("sadness");
        }

        // For loops
        int i; // this brings i out of scope
        for (i = 0; i <= 10; i++) { // i++ is just incrementing the i variable by 1, every loop
            String hello = "hello";
            System.out.println(i);
        }
        System.out.println(i);
        // System.out.println(hello); hello variable not in scope of the method, it's in the block scope of the for loop
        
    }
}

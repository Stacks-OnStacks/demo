package com.revature.java_basics;

public class BasicsDriverPart2 {
    public static void main(String[] args) {
        // More For Loops
        int result = 0;
        result = 0;
        result = 5 + 7; // 12
        result += 8; // the += takes the variable at it's current state/value and adds with w/e is specified after
        // result == 20;
        // for loop structure = for(assessment variable; conditional statement; increment)
        for(int i = 1; i <= 20;i += 3){ // i ++ increaments 1, i += x will add x
            result *= i;
        }

        System.out.println(result);
        result = 0;
        for(int i = 1; i <= 20;i += 3){ // i ++ increaments 1, i += x will add x
            if(i % 2 == 1){ // % modulo, this gives the remainder after division
                // i.e. 3/2 remainder of 1
                // i.e. 4/2 reminder 0
                result += i;
            } else {
                System.out.println(i + " this is even.");
            }

        }
        System.out.println(result);

        System.out.println(1 + 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 - 2);
        System.out.println(1 % 2);

        int test = 4;
        System.out.println("-----This will showcase assignment operators");
        System.out.println(test += 2); // multi-cursor = hold alt + shift and left mouse click where you want a cursor
        System.out.println(test *= 2);
        System.out.println(test /= 2);
        System.out.println(test -= 2);
        System.out.println(test %= 2);

        int i = 0;
        System.out.println(++i); // increments at the beginng of this lines execution
        System.out.println(i++); // increments AFTER the execution of this line


    }
}

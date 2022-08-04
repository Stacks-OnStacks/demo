package com.revature.jank_unit;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    // Polymorphism - overloading
    public int add(int... nums){ // I can get add(1,2,3) and get 6, or add(1,2,3,4) get 10....etc
        int result = 0;
        for(int num:nums){
            result += num;
        }

        return result;
    }
}

package com.revature.jank_unit;

import static com.revature.jank_unit.JankDriver.assertThat;

public class CalculatorTestSuite {

    // sut - stands for System Under Testing
    Calculator sut = new Calculator();

    @Test
    public void test_addTwoNumbers_CorrectAnswer(){
        int expected = 4;
        int actual = sut.add(2,2);

        System.out.println("Test 1 is done");
        assertThat(expected == actual);
    }

    @Test
    public void test_addManyNumbers_CorrectAnswer(){
        int expected = 6;
        int actual = sut.add(1,2,3);

        System.out.println("Test 2 is done");
        assertThat(expected == actual);
    }

    @Test
    public void test_addFourNumbers_CorrectAnswer(){
        int expected = 10;
        int actual = sut.add(1,2,3,4);

        System.out.println("Test 3 is done");
        assertThat(expected == actual);
    }

    public void notATest(){
        System.out.println("This ain't no test");
    }

    @Test
    public void testButNotImpl(){
        System.out.println("Test not yet impl");
        assertThat(false);
    }

    @Test
    public void test_addNegativeNumbers_CorrectAnswer(){
        int expected = 4;
        int actual = sut.add(2,2,2,-2);

        System.out.println("Test 4 is done");
        assertThat(expected == actual);
    }

}

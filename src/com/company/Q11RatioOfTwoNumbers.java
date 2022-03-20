package com.company;
/*
11. Write a function to calculate ratios of two numbers
 */
public class Q11RatioOfTwoNumbers {
    public static float ratioTwoNums(int a, int b) {
        float r = (float) a / b;
        System.out.printf("ratio of %d, %d = %.2f\n", a, b, r);
        return r;
    } // end of ratioTwoNums method

    public static void main(String[] args) {
        float ratio = ratioTwoNums(3, 4);
    } // end of the main method
} // end of the RatioOfTwoNumbers class

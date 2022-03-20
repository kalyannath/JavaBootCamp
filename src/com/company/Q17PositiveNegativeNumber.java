package com.company;
/*
17. Write a program to check whether given numbers are positive, negative or zero.
 */
public class Q17PositiveNegativeNumber {
    public static void isPositiveNegative(float a) {
        if (a > 0) {
            System.out.printf("%.2f is a positive number\n", a);
        } else if (a < 0) {
            System.out.printf("%.2f is a negative number\n", a);
        } else {
            System.out.printf("%.2f is zero\n", a);
        }
    } //  end of the isPositiveNegative method

    public static void main(String[] args) {
        isPositiveNegative(1);
        isPositiveNegative(-30.45f);
        isPositiveNegative(0);
        isPositiveNegative(-0);
    } // end of the main method
} // end of the PositiveNegativeNumber class

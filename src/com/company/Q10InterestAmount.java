package com.company;
/*
10. Write a program to calculate interest amount for loan amount, rate of interest and time period
 */
public class Q10InterestAmount {
    public static float interestAmount(float p, float t, float r) {
        float intAmount = (p * t * r) / 100;
        System.out.printf("%.0f rupees is the interest amount\nfor " +
                "%.0f rupees principle amount\nfor %.0f years time period with " +
                "%.0f%% interest rate\n", intAmount, p, t, r);
        return intAmount;
    } // end of the interestAmount method

    public static void main(String[] args) {
        float intAmount1 = interestAmount(100, 2, 3);
        System.out.println(intAmount1);
    } // end of the main method
} // end of the InterestAmount Class

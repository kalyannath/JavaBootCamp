package com.company;
/*
15. Write a function to calculate profit,
if cost price and selling price are given as inputs.
 */
public class Q15CalculateProfit {
    public static float calcProfit(float costPrice, float sellPrice) {
        float p = sellPrice - costPrice;
        System.out.printf("profit = %.2f\n", p);
        return p;
    } // end of the calcProfit method

    public static void main(String[] args) {
        float profit1 = calcProfit(20, 40);
        float profit2 = calcProfit(30, 25);
        float profit3 = calcProfit(46.5f, 50);
        System.out.println(profit1);
        System.out.println(profit2);
        System.out.println(profit3);
    } // end of the main method

} // end of the CalculateProfit class


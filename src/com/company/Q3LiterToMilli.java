package com.company;
/*
3. write a program to calculate the millilitres in a 2.5678 litres of milk
 */
public class Q3LiterToMilli {
    public static float litToMil(float lit) {
        float mil = lit * 1000f;
        System.out.printf("%f liters of milk is = %f milli liters\n", lit, mil);
        return mil;
    } // end of the litToMil method


    public static void main(String[] args) {
        float milkInMl = litToMil(2.5f);
    } // end of the main method
} // end of the LiterToMilli class

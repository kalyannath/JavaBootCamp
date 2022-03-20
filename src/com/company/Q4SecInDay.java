package com.company;

/*
4. write a function to calculate seconds in a day
 */

public class Q4SecInDay {

    public static int secondsInDay() {
        int seconds = 24 * 60 * 60;
        System.out.printf("%d seconds in a day\n", seconds);
        return seconds;
    } // end of the secondsInDay program

    public static void main(String[] args) {
        int secInDay = secondsInDay();

    } // end of the main method
} // end of the SecInDay class

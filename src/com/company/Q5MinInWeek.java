package com.company;
/*
5. write a program to convert a week to minutes
 */
public class Q5MinInWeek {
    public static int minInWeek() {
        int min = 7 * 24 * 60;
        System.out.printf("%d minutes in a week\n", min);
        return min;
    } // end of the minInWeek method

    public static void main(String[] args) {
        int minutes = minInWeek();
    } // end of the main method
} // end of the MinInWeek class

package com.company;
/*
6. write a program to convert an year into weeks
 */
public class Q6WeeksInYear {
    public static int weeksInYear(){
        int weeks = 365/7;
        System.out.printf("%d weeks in a year\n", weeks);
        return weeks;
    } // end of the weeksInYear method

    public static void main(String[] args) {
        int weeks = weeksInYear();
    } // end of the main method

} // end of the WeeksInYear class


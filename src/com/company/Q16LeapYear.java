package com.company;
/*
16. Write a program to determine whether the given year is leap year or not.
 */
public class Q16LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                System.out.printf("%d is leap year\n", year);
                return true;
            }
            else {
                System.out.printf("%d is not leap year\n", year);
                return false;
            }
        }
        else {
            if ((year % 4) == 0) {
                System.out.printf("%d is leap year\n", year);
                return true;
            }
            else {
                System.out.printf("%d is not leap year\n", year);
                return false;
            }
        }


    } // end of the isLeapYear method
    public static void main(String[] args) {
        boolean leap2020 = isLeapYear(2020);
        boolean leap2100 = isLeapYear(2100);
        boolean leap100 = isLeapYear(100);
        System.out.println(leap2020);
    } // end of the main method

} // end of the LeapYear class

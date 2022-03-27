package com.company;

import java.util.ArrayList;

/*
26.Create a program that asks the user for a number and
then prints out a list of all the divisors of that number.
 */
public class Q26Divisors {
    public static ArrayList<Integer> divisors(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(divisors(13));
        System.out.println(divisors(46));
        System.out.println(divisors(27));
        System.out.println(divisors(1));
    }
}

package com.company;

import java.util.Calendar;
import java.util.Scanner;

/*
23.Create a program that asks the user to enter their name and their age.
Print out a message addressed to them that tells them the year that they
will turn 100 years old

 */
public class Q23Turn100YearsOld {
    public static int year100(String name, int age) {
        int y;
        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        y = cYear + (100 - age);
        System.out.println("Hi " + name + ". you will be 100 years old in the year " + y);
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        year100(name, age);
    }
}

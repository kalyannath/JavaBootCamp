package com.company;

import java.util.Scanner;

/*
24.Ask the user for a number.
Depending on whether the number is even or odd,
print out an appropriate message to the user.
 */
public class Q24EvenOdd {
    public static String evenOdd(int number) {
        if (number == 0)
        {
            return number + " is Zero";
        }
        else if (number % 2 == 0)
        {
            return number + " is Even Number";
        } else
        {
            return number + " is Odd Number";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(evenOdd(n));
    }
}

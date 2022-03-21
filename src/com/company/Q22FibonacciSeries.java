package com.company;
/*
22. Write a program to print first 10 Fibonacci series starting with 0,1.
 */
public class Q22FibonacciSeries {
    // 10 fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static int[] fibonacciSeries(int n) {
        int[] fib = new int[n];
        int f1 = 0;
        int f2 = 1;
        int count = 2;
        fib[0] = f1;
        fib[1] = f2;
        while (count < n)
        {
            f2 = f1 + f2;
            fib[count] = f2;
            f1 = fib[count - 1];
            count++;
        }
        return fib;
    }
    public static void main(String[] args) {
        int[] fib1 = fibonacciSeries(10);
        for (int element: fib1)
        {
            System.out.println(element);
        }

    }
}

package com.company;
/*
21. Write a program to print given 5 numbers in ascending order.
 */
public class Q21AscendingOrder {
    public static float[] ascendingOrder(float ...a) {
        // arr[5] = 5, 4, 3, 2, 1
        // output = 1, 2, 3, 4, 5
        float x;

        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i] > a[j])
                {
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        float[] num = ascendingOrder(50f, 40.f, 380.56f, 50, 1.6f);
        for (float element: num) {
            System.out.println(element);
        }
    }
} // end of the Q21AscendingOrder class

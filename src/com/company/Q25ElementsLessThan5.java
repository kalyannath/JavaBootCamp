package com.company;
/*
25.write a program that prints out all the elements of the list that are less than 5.
 */

public class Q25ElementsLessThan5 {
    public static float[] lessThan5(float ...a) {
        int len = 0;
        for (float element: a)
        {
            if (element < 5)
            {
                len++;
            }
        }
        float[] result = new float[len];
        int count = 0;
        for (float element: a)
        {
            if (element < 5)
            {
                result[count] = element;
                count++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        float[] ar1 = lessThan5(1, 3, 6, 7, 8, 3, 9);
        System.out.println(ar1.length);
        for (float element: ar1)
        {
            System.out.println(element);
        }
    }
}

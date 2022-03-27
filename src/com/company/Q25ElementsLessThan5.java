package com.company;
/*
25.write a program that prints out all the elements of the list that are less than 5.
 */

import java.util.ArrayList;

public class Q25ElementsLessThan5 {
    public static ArrayList<Float> lessThan5(float ...a) {
        ArrayList<Float> result = new ArrayList<>();
        for (float element: a)
        {
            if (element < 5)
            {
                if (!result.contains(element)) {
                    result.add(element);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(lessThan5(1, 3, 6, 7, 8, 3, 9));
    }
}

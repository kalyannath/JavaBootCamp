package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/*
31.Write a program that takes a list of numbers and
makes a new list of only the first and last elements of the given list.
 */
public class Q31StartAndEndElements {
    public static ArrayList startEndElements(ArrayList a) {
        ArrayList result = new ArrayList();
        result.add(a.get(0));
        result.add(a.get(a.size() - 1));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(startEndElements(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, "a", 3L, 5f))));
    }
}

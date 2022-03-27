package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
27.write a program that returns a list that contains
only the elements that are common between the lists
 */
public class Q27CommonElements {
    public static ArrayList<Integer> commonElements(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element: a) {
            if (b.contains(element)) {
                if (!result.contains(element)) {
                    result.add(element);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(commonElements(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 5)),
        new ArrayList<>(Arrays.asList(2, 3, 4, 5, 2, 3, 4, 5, 6))));
    }
}

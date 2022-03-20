package com.company;
/*
14. Write a function to convert kilometres into meters.
 */
public class Q14KMToM {
    public static float kmToMeters(float km) {
        float met = km * 1000;
        System.out.printf("%.2f km = %.2f meters\n", km, met);
        return met;
    } // end of the kmToMeters method

    public static void main(String[] args) {
        float met1 = kmToMeters(10);
        float met2 = kmToMeters(18.9f);
        System.out.println(met1);
        System.out.println(met2);
    } // end of the main method

} // end of the KmToM class

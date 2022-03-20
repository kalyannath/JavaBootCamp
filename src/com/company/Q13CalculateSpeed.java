package com.company;
/*
13. Write a function to calculate speed of the vehicle with distance and time as inputs.
 */
public class Q13CalculateSpeed {
    public static float calcSpeed(float d, float t) {
        float s = d * t;
        System.out.printf("speed of the vehicle = %.2f km-ph\n", s);
        return s;
    } // end of the calcSpeed method

    public static void main(String[] args) {
        float speed1 = calcSpeed(100, 1);
        float speed2 = calcSpeed(200, 1.5f);
        calcSpeed(200, 4);
        System.out.println(speed1);
        System.out.println(speed2);
    } // end of the main method
} // end of the CalculateSpeed class


package com.company;
/*
12. Write a function to convert celsius to fahrenheit.
 */
public class Q12CelsiusToFahrenheit {
    public static float celToFar(float cel) {
        float far = (float) (cel * 1.8 + 32);
        System.out.printf("%.2f celsius = %.2f fahrenheit\n", cel, far);
        return far;
    } // end of the celToFar

    public static void main(String[] args) {
        float fahrenheit1 = celToFar(36);
        float fahrenheit2 = celToFar(36.55f);
        System.out.println(fahrenheit1);
        System.out.println(fahrenheit2);
    } // end of the main method
} // end of the CelsiusToFahrenheit


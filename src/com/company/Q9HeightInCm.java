package com.company;
/*
9. Write a function to calculate height in centimetres
 */
public class Q9HeightInCm {
    private static float heightInCm(float h) {
        float hcm = h * 30.48f;
        System.out.printf("%f in feet = %f in cm \n", h, hcm);
        return hcm;
    } // end of the heightInCm method

    public static void main(String[] args) {
        float h1 = heightInCm(5.7f);
        float h2 = heightInCm(5.8f);
    } // end of the main method
} // end of the HeightInCm class

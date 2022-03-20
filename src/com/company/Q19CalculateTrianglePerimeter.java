package com.company;
/*
19. Write a program to calculate the perimeter of a triangle,
with all the three sides as inputs.
 */
public class Q19CalculateTrianglePerimeter {
    public static float trianglePerimeter(float a, float b, float c) {
        float peri = a + b + c;
        System.out.printf("The perimeter of the triangle = %.2f\n", peri);
        return peri;
    } // end of the trianglePerimeter method

    public static void main(String[] args) {
        float peri1 = trianglePerimeter(1, 2, 3);
        float peri2 = trianglePerimeter(1.3f, 3.5f, 9);
        System.out.println(peri1);
        System.out.println(peri2);

    } // end of the main method
} // end of the CalculateTrianglePerimeter class
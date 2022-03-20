package com.company;
/*
2. Write a program to calculate the area of a rectangle.
 */
public class Q2CalculateRectangleArea {
    public static float rectangleArea(float a, float b) {
        float area = a * b;
        System.out.println("Area of the rectangle : " + area);
        return Math.abs(area);
    } // end of the rectangleArea method

    public static void main(String[] args) {
        float rectArea1 = rectangleArea(1, -3.2f); // 1 * 3 = 3
        float rectArea2 = rectangleArea(2, 4); // 2 * 4 = 8
        float rectArea3 = rectangleArea(5, 3); // 5 * 3 = 15
        System.out.println(rectArea1);
        System.out.println(rectArea2);
        System.out.println(rectArea3);
        System.out.println(Math.abs(3.4000000953674316));
    } // end of the main method
}

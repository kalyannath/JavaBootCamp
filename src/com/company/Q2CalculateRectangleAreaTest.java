package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q2CalculateRectangleAreaTest {

    @org.junit.jupiter.api.Test
    void rectangleArea() {
        float rectArea1 = Q2CalculateRectangleArea.rectangleArea(1, 3);
        assertEquals(3, rectArea1);
        float rectArea2 = Q2CalculateRectangleArea.rectangleArea(2, 6);
        assertEquals(12, rectArea2);
        float rectArea3 = Q2CalculateRectangleArea.rectangleArea(-4, 6);
        assertEquals(24, rectArea3);

    }
}
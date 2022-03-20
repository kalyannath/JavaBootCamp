package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q19CalculateTrianglePerimeterTest {

    @org.junit.jupiter.api.Test
    void trianglePerimeter() {
        float peri1 = Q19CalculateTrianglePerimeter.trianglePerimeter(1, 2, 3);
        assertEquals(6, peri1);
        float peri2 = Q19CalculateTrianglePerimeter.trianglePerimeter(1.3f, 3.5f, 9.2f);
        assertEquals(14, peri2);
    }
}
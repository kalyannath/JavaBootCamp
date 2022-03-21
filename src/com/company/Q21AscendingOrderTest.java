package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q21AscendingOrderTest {

    @Test
    void ascendingOrder() {
        float[] a1 = Q21AscendingOrder.ascendingOrder(3, 6, 3, 2, 1);
        float[] a2 = {1, 2, 3, 3, 6};
        float[] b1 = Q21AscendingOrder.ascendingOrder(50f, 40.f, 380.56f, 50, 1.6f);
        float[] b2 = {1.6f, 40f, 50f, 50f, 380.56f};
        assertArrayEquals(b2, b1);
    }
}
package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q15CalculateProfitTest {

    @org.junit.jupiter.api.Test
    void calcProfit() {
        float profit1 = Q15CalculateProfit.calcProfit(20, 40);
        assertEquals(20.0, profit1);
        float profit2 = Q15CalculateProfit.calcProfit(30, 25);
        assertEquals(-5.0, profit2);
        float profit3 = Q15CalculateProfit.calcProfit(46.5f, 50);
        assertEquals(3.5, profit3);
    }
}
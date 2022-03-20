package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q10InterestAmountTest {

    @org.junit.jupiter.api.Test
    void interestAmount() {
        float intAmount1 = Q10InterestAmount.interestAmount(100, 2, 3);
        assertEquals(6.0, intAmount1);
    }
}
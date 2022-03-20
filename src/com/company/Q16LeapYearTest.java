package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q16LeapYearTest {

    @org.junit.jupiter.api.Test
    void isLeapYear() {
        boolean leap2020 = Q16LeapYear.isLeapYear(2020);
        assertTrue(leap2020);
        boolean leap2100 = Q16LeapYear.isLeapYear(2100);
        assertFalse(leap2100);
        boolean leap100 = Q16LeapYear.isLeapYear(100);
        assertFalse(leap100);
    }
}
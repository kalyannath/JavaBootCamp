package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q23Turn100YearsOldTest {

    @Test
    void testYear100() {
        int y1 = Q23Turn100YearsOld.year100("Kalyan", 24);
        int y2 = Q23Turn100YearsOld.year100("Chiranjeevi", 66);
        int y3 = Q23Turn100YearsOld.year100("Ram Charan", 36);
        int y4 = Q23Turn100YearsOld.year100("NTR", 38);
        int y5 = Q23Turn100YearsOld.year100("Rajamouli", 48);
        assertEquals(2098, y1);
        assertEquals(2056, y2);
        assertEquals(2086, y3);
        assertEquals(2084, y4);
        assertEquals(2074, y5);
    }
}
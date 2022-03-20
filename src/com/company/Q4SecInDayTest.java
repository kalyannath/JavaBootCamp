package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q4SecInDayTest {

    @Test
    void secondsInDay() {
        int sec = Q4SecInDay.secondsInDay();
        assertEquals(86400, sec);
    }
}
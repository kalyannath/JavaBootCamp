package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q5MinInWeekTest {

    @Test
    void minInWeek() {
        int minutes = Q5MinInWeek.minInWeek();
        assertEquals(10080, minutes);
    }
}
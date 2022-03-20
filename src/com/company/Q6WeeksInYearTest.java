package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q6WeeksInYearTest {

    @org.junit.jupiter.api.Test
    void weeksInYear() {
        int weeks = Q6WeeksInYear.weeksInYear();
        assertEquals(52, weeks);
    }
}
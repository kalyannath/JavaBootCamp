package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q3LiterToMilliTest {

    @org.junit.jupiter.api.Test
    void litToMil() {
        float lit1 = Q3LiterToMilli.litToMil(2.5f);
        assertEquals(2500.00, lit1);
        float lit2 = Q3LiterToMilli.litToMil(2.23f);
        assertEquals(2230.00, lit2);
    }
}
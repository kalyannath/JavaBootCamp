package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q14KMToMTest {

    @org.junit.jupiter.api.Test
    void kmToMeters() {
        float met1 = Q14KMToM.kmToMeters(10);
        assertEquals(10000.0, met1);
        float met2 = Q14KMToM.kmToMeters(18.9f);
        assertEquals(18900.0, met2);
    }
}
package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q13CalculateSpeedTest {

    @org.junit.jupiter.api.Test
    void calcSpeed() {
        float speed1 = Q13CalculateSpeed.calcSpeed(100, 1);
        assertEquals(100, speed1);
        float speed2 = Q13CalculateSpeed.calcSpeed(200, 1.5f);
        assertEquals(300, speed2);

    }
}
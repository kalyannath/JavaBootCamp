package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q12CelsiusToFahrenheitTest {

    @org.junit.jupiter.api.Test
    void celToFar() {
        float fahrenheit1 = Q12CelsiusToFahrenheit.celToFar(36);
        float fahrenheit2 = Q12CelsiusToFahrenheit.celToFar(36.55f);
        assertEquals(96.80000305175781, fahrenheit1);
        assertEquals(97.79000091552734, fahrenheit2);
    }
}
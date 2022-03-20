package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1CalculateAgeTest {

    @org.junit.jupiter.api.Test
    void calculateAge() {
        // tests cases
        boolean SeniorCitizen1 = Q1CalculateAge.calculateAge("16-06-1997");
        assertEquals(false, SeniorCitizen1);
        boolean SeniorCitizen2 = Q1CalculateAge.calculateAge("16-06-1977");
        assertEquals(false, SeniorCitizen2);
        boolean SeniorCitizen3 = Q1CalculateAge.calculateAge("16-06-1957");
        assertEquals(true, SeniorCitizen3);
        boolean SeniorCitizen4 = Q1CalculateAge.calculateAge("19-03-1962");
        assertEquals(true, SeniorCitizen4);
    }
}
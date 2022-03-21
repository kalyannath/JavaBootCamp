package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q24EvenOddTest {

    @Test
    void testEvenOdd() {
        String s1 = Q24EvenOdd.evenOdd(4);
        String s2 = Q24EvenOdd.evenOdd(3);
        String s3 = Q24EvenOdd.evenOdd(0);
        assertEquals(4 + " is Even Number", s1);
        assertEquals(3 + " is Odd Number", s2);
        assertEquals(0 + " is Zero", s3);
    }
}
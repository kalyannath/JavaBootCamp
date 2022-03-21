package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q22FibonacciSeriesTest {

    @Test
    void testFibonacciSeries() {
        int[] expected = new int[] {0, 1, 1, 2, 3, 5, 8};
        int[] expected1 = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] expected2 = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
        int[] expected3 = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        int[] fib = Q22FibonacciSeries.fibonacciSeries(7);
        int[] fib1 = Q22FibonacciSeries.fibonacciSeries(10);
        int[] fib2 = Q22FibonacciSeries.fibonacciSeries(15);
        int[] fib3 = Q22FibonacciSeries.fibonacciSeries(20);
        assertArrayEquals(expected, fib);
        assertArrayEquals(expected1, fib1);
        assertArrayEquals(expected2, fib2);
        assertArrayEquals(expected3, fib3);
    }
}
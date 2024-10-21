package org.kata.michael;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestPrimeTest {

    private final LargestPrime largestPrime = new LargestPrime();

    @Test
    void testLargestPrimeBelowTen() {
        assertEquals(7, largestPrime.getLargestPrime(10), "The largest prime below 10 should be 7");
    }

    @Disabled
    @Test
    void testLargestPrimeBelowTwenty() {
        assertEquals(19, largestPrime.getLargestPrime(20), "The largest prime below 20 should be 19");
    }

    @Disabled
    @Test
    void testLargestPrimeTwo() {
        assertEquals(2, largestPrime.getLargestPrime(2), "The largest prime below or equal to 2 should be 2");
    }

    @Disabled
    @Test
    void testLargestPrimeOne() {
        assertEquals(-1, largestPrime.getLargestPrime(1), "There are no prime numbers below or equal to 1");
    }

    @Disabled
    @Test
    void testLargestPrimeNegativeNumber() {
        assertEquals(-1, largestPrime.getLargestPrime(-5), "There are no prime numbers below or equal to any negative number");
    }

    // Additional tests for larger numbers

    @Disabled
    @Test
    void testLargestPrimeBelowHundred() {
        assertEquals(97, largestPrime.getLargestPrime(100), "The largest prime below 100 should be 97");
    }

    @Disabled
    @Test
    void testLargestPrimeBelowThousand() {
        assertEquals(997, largestPrime.getLargestPrime(1000), "The largest prime below 1000 should be 997");
    }

    @Disabled
    @Test
    void testLargestPrimeAroundTenThousand() {
        assertEquals(9973, largestPrime.getLargestPrime(10000), "The largest prime below 10000 should be 9973");
    }

    @Disabled
    @Test
    void testLargestPrimeLargeNumber() {
        assertEquals(999331, largestPrime.getLargestPrime(999331), "The largest prime below or equal to 999331 should be 999331");
    }

    @Disabled
    @Test
    void testLargestPrimeJustAboveLargeNumber() {
        assertEquals(999331, largestPrime.getLargestPrime(999332), "The largest prime below 999332 should be 999331");
    }
}

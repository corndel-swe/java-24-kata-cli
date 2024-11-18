package org.kata.damian;

public class LargestPrime {

    /**
     * Finds the largest prime number less than or equal to a given integer.
     * <p>
     * The function takes an integer input and returns the largest prime number that is less than or equal
     * to the specified integer. If the input integer is less than 2, the function will return -1, as there
     * are no prime numbers below 2. If the input integer itself is prime, the function will return that
     * integer. The implementation efficiently checks each number starting from the given integer and works
     * downwards, stopping at the first prime number it encounters.
     * <p>
     * A prime number is defined as a natural number greater than 1 that cannot be formed by multiplying
     * two smaller natural numbers. This means that a prime number has exactly two distinct positive divisors:
     * 1 and itself.
     */

    public static int getLargestPrime(int n) {
        if (n < 2) {
            return -1;
        }

        // Start from n and go down to 2 - to find first/largest prime
        for (int i = n; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // Check for factors among odd numbers starting from 3.
        // We only need to check odd numbers (i) because all even numbers greater than 2
        // have already been ruled out as potential factors.
        // The loop continues as long as i is less than or equal to the square root of num.
        // This is important because if num has any factors, at least one of them
        // must be less than or equal to the square root of num.
        // If no factors are found by the time we reach the square root,
        // we can conclude that num is prime.
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            // If i divides num, then num is not prime
            if (num % i == 0) return false;
        }


        // If there are no factors found, return true
        return true;
    }
}


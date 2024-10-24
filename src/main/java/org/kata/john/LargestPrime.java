package org.kata.john;

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
        if(n < 2){
            return -1;
        } else if (isPrime(n)){
            return n;
        } else {
            for(int i = n-1; i > 2 ; i--) {
                if(isPrime(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}



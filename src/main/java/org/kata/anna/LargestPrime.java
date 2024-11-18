package org.kata.anna;

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

    public int getLargestPrime(int n) {
        int highestPrimeNumber = 0;
        boolean notPrime = false;

        if (n > 1) {
            // Check for prime numbers in range descending
            for (int numbersDesc = n; numbersDesc > 1; numbersDesc--) {
                //            System.out.println("numbersDesc:" + numbersDesc);

                // Check if current number is a prime numer
                for (int j = 2; j < numbersDesc; j++) {

                    // If number is % by a number not 1 or itself, number not prime
                    if (numbersDesc % j == 0) {
                        //                    System.out.println("numbersDesc:" + numbersDesc);
                        //                    System.out.println("Not prime");
                        notPrime = true;
                        break;
                    }
                }
                // If the number is not prime, set highest number

                highestPrimeNumber = notPrime ? highestPrimeNumber : numbersDesc;
                notPrime = false;
//                System.out.println(highestPrimeNumber);
                if (highestPrimeNumber > 0) {
                    System.out.println("Highest prime number has been found");
                    break;
                }

            }

            return highestPrimeNumber;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        LargestPrime number = new LargestPrime();

        System.out.println(number.getLargestPrime(1));
    }

}



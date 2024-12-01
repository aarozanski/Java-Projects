package com.example.homework_1;

public class PrimeChecker {
    public static void main(String[] args) {
        // Example number to check for primality
        int number = 29;

        // Calling the isPrime method to determine if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * Checks if a given number is a prime number.
     *
     * @param num The number to check for primality.
     * @return boolean True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1, so return false if num is less than 2
        if (num < 2) {
            return false;
        }

        // Only need to check up to the square root of num for divisors
        // If num is divisible by any number between 2 and its square root, it is not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // Check if num is evenly divisible by i (i.e., no remainder)
            if (num % i == 0) {
                // If num is divisible by i, then num is not prime
                return false;
            }
        }

        // If no divisors were found from 2 to the square root of num, num is prime
        return true;
    }
}

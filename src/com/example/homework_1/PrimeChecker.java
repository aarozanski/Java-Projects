package com.example.homework_1;

public class PrimeChecker {
    public static void main(String[] args) {
        int number = 70;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        // Check if num is less than 2
        if (num < 2) {
            return false;
        }

        // Check from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by some number other than 1 and itself
            }
        }

        return true; // num is prime
    }
}


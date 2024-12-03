package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

    public static List<Integer> generatePrimes(int n) {
        if (n <= 0) {
            return new ArrayList<>(); // Return empty list for non-positive input
        }

        List<Integer> primes = new ArrayList<>();
        int number = 2; // Start checking from the first prime number

        while (primes.size() < n) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by another number, not prime
            }
        }
        return true; // No divisors found, it's prime

}}

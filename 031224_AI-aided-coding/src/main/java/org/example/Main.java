package org.example;

import java.util.List;

import static org.example.PalindromeChecker.isPalindrome;
import static org.example.PrimeGenerator.generatePrimes;
import static org.example.StringReverser.reverseString;

public class Main {
    public static void main(String[] args) {

        // String reverse

        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Palindrome

        String test1 = "anna";
        String test2 = "hello";
        String test3 = "racecar";
        String test4 = null;

        System.out.println("Is 'anna' a palindrome? " + isPalindrome(test1));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome(test2));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome(test3));
        System.out.println("Is null a palindrome? " + isPalindrome(test4));

        // Prime Generator

        int n = 10; // Example: Generate the first 10 prime numbers
        List<Integer> primes = generatePrimes(n);
        System.out.println("The first " + n + " prime numbers are: " + primes);
    }
}


// RESEARCH

// You work for a health insurance company and are supposed to reformat some medical records.
// It would be fatal to post this data to ChatGPT to solve the task! Why?

// Posting medical records to ChatGPT risks exposing sensitive data and violating data protection.
// This could lead to severe legal, financial, and reputational consequences for your company.

// ---------------------------------

//Can you imagine how ChatGPT could still help you with this task?

// ChatGPT can assist by generating code templates, pseudocode, or guidance on securely
// reformatting and anonymizing medical data. It ensures sensitive information remains protected by
// working on abstract or hypothetical examples.

// ---------------------------------

//While writing a Java program, you wonder how to convert a string (e.g., "4232") to an int in Java.
// What would be a suitable ChatGPT prompt?

// "How can I convert a string, like '4232', to an integer in Java using best practices?"

// ----------------------------------

//What does ChatGPT give you as the result for the calculation 644136486 * 1463184?

// 942.522.069.274.624
package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false; // Null input is not a palindrome
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found, not a palindrome
            }
            start++;
            end--;
        }

        return true; // No mismatches, it's a palindrome
    }
}

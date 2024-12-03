package org.example;

public class StringReverser {
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null or empty strings
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

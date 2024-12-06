package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


// Name three Checked Exceptions that have not been mentioned in the lecture so far.

// SQLException
// Thrown when there is an issue with accessing or processing data in a database (e.g., invalid SQL queries).
//
// ParseException
// Thrown when parsing a string into a specific format (like a date or number) fails.
//
// ClassNotFoundException
// Thrown when an application tries to load a class by its name, but the class cannot be found.

// ----------------------------------

//Name three Unchecked Exceptions that have not been mentioned in the lecture so far.

// ArrayIndexOutOfBoundsException
// Thrown when attempting to access an array element with an index that is out of bounds.
//
// IllegalStateException
// Thrown when the state of an object is inappropriate for the requested operation (e.g., calling a method at the wrong time).
//
// NumberFormatException
// Thrown when attempting to convert a string into a number, but the string is not in the correct format.

// -----------------------------------

//Is "IllegalArgumentException" a Checked or an Unchecked Exception? Why?

// IllegalArgumentException is an unchecked exception.
//
// Why?
// It is a subclass of RuntimeException. This means it is not mandatory for developers to catch or declare it in their methods. It is typically used to
// indicate that a method has been passed an invalid argument (e.g., passing a negative number to a method that expects only positive numbers).
// The expectation is that programmers should ensure valid arguments before calling the method, so IllegalArgumentException serves as a safeguard.


// How often should exceptions be thrown? Research different opinions and discuss how one can run the risk of using/abusing exceptions too much.

// Exceptions should be thrown sparingly and only for truly exceptional situations that disrupt the normal flow of a program. They should not be
// used for normal flow control or predictable conditions, such as invalid user input that can be validated upfront. Overusing exceptions can lead to
// performance issues, as they are expensive to process, and make code harder to read and maintain due to excessive try-catch blocks. Catching exceptions
// too broadly, like using catch (Exception e), can also mask bugs and make debugging more difficult. To avoid overuse, developers should validate inputs,
// handle exceptions where meaningful action can be taken, and log them for debugging purposes.
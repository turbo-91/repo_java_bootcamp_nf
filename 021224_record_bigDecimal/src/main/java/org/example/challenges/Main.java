package org.example.challenges;

import org.example.bookRecord.BookRecord;

public class Main {
    public static void main(String[] args) {
        
    }
}

// RESEARCH

// All properties of records are immutable once a record has been created. At first glance, this appears to be a limitation.
// In what way is this an advantage for us? Give one or two arguments.

// Predictability: Immutable records reduce the risk of bugs related to unexpected changes in the state of objects.
// Once a record is created, its state remains consistent throughout its lifecycle.



//What is another advantage of records compared to classes?

// Records automatically generate boilerplate code.



//You are joining a development team that is working on a real estate management project. There is a record called RealEstate that represents a property.
// This record has the properties "address", "squareMeters", "numberOfRooms", and "price". Additionally, it has a method public RealEstate withPrice(double price).
// For example, it is used like RealEstate afterRaise = home.withPrice(75_000d);. You know that a record is immutable, but the method looks similar to a setter.
// What does this method do?

// Instead of modifying the existing RealEstate record it creates a new record instance with the updated price of the real estate.



//Research (or find through experimentation) a seemingly simple calculation where double produces the wrong result (in contrast to BigDecimal).
// Use different examples than the numbers mentioned in the lecture/handout.

//        double a = 0.2;
//        double b = 0.3;
//        double result = a * b;
//        System.out.println("Double result: " + result); -------- Output: 0.06 (but it's actually 0.05999999999999999)
//
//        // Using BigDecimal
//        BigDecimal bigDecimalA = new BigDecimal("0.2");
//        BigDecimal bigDecimalB = new BigDecimal("0.3");
//        BigDecimal bigDecimalResult = bigDecimalA.multiply(bigDecimalB);
//        System.out.println("BigDecimal result: " + bigDecimalResult); -------- Output: 0.06



//One might think that a tiny rounding error (that double would produce) is not worth considering.
// Name a situation in which you can imagine that such a minimal error could have an impact.

// A minimal error can have a significant impact in financial calculations, such as when calculating transaction fees in banking systems.
// For instance, a rounding error in millions of transactions could accumulate to a substantial financial discrepancy.


//You work for a pharmaceutical company and are supposed to implement a method that calculates how many shipping boxes are needed to ship a certain number of pill boxes.
// The result should represent the number of required boxes. Which RoundingMode would you use (java.math.RoundingMode)?
// Example code: https://github.com/neuefische/java-bigdecimal-roundingmode/blob/main/src/main/java/org/example/Main.java


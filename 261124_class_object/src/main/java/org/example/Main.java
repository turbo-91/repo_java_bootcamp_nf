package org.example;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("My best chess games", "Bobby Fischer", 150);
        Book book2 = new Book("My worst chess gamges","Martin Pagels", 1500);

        printBook(book);
        printBook(book2);
    }

    public static void printBook(Book book) {
        System.out.println("Das Buch hat den Titel: " + book.title + " Seitenlänge beträgt: " + book.pages + ". Und der Author ist: " + book.author);
    }

    // CODE SESSION

    // CHALLENGES

//    Research
// I- Imagine you were developers for a video game that takes place in your room.
// Choose an object in your room and think about how it could serve as an interactive element in the game.
// What properties and actions could this object have? (each person chooses an object). inputfield



//    II- Think of reasons why an object can have multiple constructors and give an example. inputfield
//    III-Can there be a class in Java that does not have a single object? inputfield
//    IV- Can there be an object in Java that does not belong to any class? inputfield


//
//    Coding: Classes and Objects
//    Create a class 'Car' together that represents the properties and methods of a car.
//
//    Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc.
//            Step 2: Implement a method that "starts" the car and outputs a message.
//    Step 3: Create an object of the class 'Car' and call the method to start it.
//            Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed.
//    Step 5: Create a second object of the class 'Car', accelerate it, and display the speed.


//    Bonus
//
//            Class 'Person' inputfield
//    Create a class 'Person' that contains properties like 'Name', 'Age', 'Gender', etc.
//    Implement a method that introduces the person, for example, 'Hello, I am [Name] and [Age] years old.'
//    Create objects of the class 'Person' for different individuals and call the introduction method.



}

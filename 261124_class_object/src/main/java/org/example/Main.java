package org.example;

public class Main {
    public static void main(String[] args) {

       // CODE SESSION
        Book book = new Book("My best chess games", "Bobby Fischer", 150);
        Book book2 = new Book("My worst chess gamges","Martin Pagels", 1500);


        printBook(book);
        printBook(book2);

        //  CODE CHALLENGES

        Lamp lamp1 = new Lamp("IKEA", "brightWhite", true);
        Lamp lamp2 = new Lamp("Vintage", "warmWhite", false);
        Car flitzer1 = new Car("Porsche", "Carrera", "hot pink", true, 0);
        Car flitzer2 = new Car("Renault", "Twingo", "sonnengelb", true, 30);

        printLamp(lamp1);
        printLamp(lamp2);
        startCar(flitzer1);
        accelerateCar(flitzer2);

    }

    // CODE SESSION
    public static void printBook(Book book) {
        System.out.println("Das Buch hat den Titel: " + book.title + " Seitenlänge beträgt: " + book.pages + ". Und der Author ist: " + book.author);
    }

    //  CODE CHALLENGES
    public static void printLamp(Lamp lamp) {
        System.out.println("LAMPE - Marke: " + lamp.brand + ", Lichtfarbe: " + lamp.colorLight + ", Eingeschaltet: " + lamp.turnedOn);
    }

    public static void startCar(Car car){
        System.out.println("This " + car.model + " of the brand " + car.brand + " in the color " + car.color + " has started, right? " + car.started + ".");
    }

    public static void accelerateCar(Car car){
        System.out.println("This " + car.model + " of the brand " + car.brand + " in the color " + car.color + " is at what Speed now? It is at: " + car.speed + ".");
    }



//    Research

// I- Imagine you were developers for a video game that takes place in your room.
// Choose an object in your room and think about how it could serve as an interactive element in the game.
// What properties and actions could this object have? (each person chooses an object.
// siehe oben. "Lamp"


//    II- Think of reasons why an object can have multiple constructors and give an example.
    // Objects can be initialized using various types and numbers of parameters (e.g., partial vs. complete information).

//    III-Can there be a class in Java that does not have a single object?
    // Yes. Any class exists on its own even if there isn't a single instance (object) of this class declared anywhere in the code.


//    IV- Can there be an object in Java that does not belong to any class? inputfield
    // No! As an object is the instance of a class. A class is constitutive to an object.


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

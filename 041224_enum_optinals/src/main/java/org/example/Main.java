package org.example;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // ENUM
//        Weekdays day = Weekdays.SATURDAY;
//        System.out.println(day);
//
//        if (day.getWhatDay().equals("Weekend")) {
//            System.out.println("Thank god it's the weekend!");
//        }
//        else System.out.println("WTF, 2 more daysssssss");

        // OPTIONAL

        // CHALLENGES

        Person ed = new Person(1, "Ed", DaysOfWeek.MONDAY, Gender.FEMALE);
        Person edie = new Person(2, "Edie", DaysOfWeek.THURSDAY, Gender.GENDER_NON_CONFORMING);
        Person john = new Person(3, "John", DaysOfWeek.WEDNESDAY, Gender.MALE);
        Person jane = new Person(4, "Jane", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person alex = new Person(5, "Alex", DaysOfWeek.SATURDAY, Gender.GENDER_NON_CONFORMING);

        // Person repository
        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(ed);
        personRepository.addPerson(edie);
        personRepository.addPerson(john);
        personRepository.addPerson(jane);
        personRepository.addPerson(alex);

        // Check if the person with ID 1 exists
        Optional<Person> optionalPerson1 = personRepository.getPersonById(1);

        if (optionalPerson1.isPresent()) {
            Person person = optionalPerson1.get();
            System.out.println(person.name() + " who is " + person.gender() + " is happy it is a " + person.favoriteDay());
        } else {
            System.out.println("Person not found");
        }

        // Check if the person with ID 3 exists
        Optional<Person> optionalPerson3 = personRepository.getPersonById(3);

        if (optionalPerson3.isPresent()) {
            Person person = optionalPerson3.get();
            System.out.println(person.name() + " is happy it is a " + person.favoriteDay());
        } else {
            System.out.println("Person not found");
        }

        // Check if the person with ID 5 exists
        Optional<Person> optionalPerson5 = personRepository.getPersonById(5);

        if (optionalPerson5.isPresent()) {
            Person person = optionalPerson5.get();
            System.out.println(person.name() + " is happy it is a " + person.favoriteDay());
        } else {
            System.out.println("Person not found");
        }

        // Check if the person with ID 6 exists (not added to repository)
        Optional<Person> optionalPerson6 = personRepository.getPersonById(6);

        if (optionalPerson6.isPresent()) {
            Person person = optionalPerson6.get();
            System.out.println(person.name() + " is happy it is a " + person.favoriteDay());
        } else {
            System.out.println("Person not found");
        }

        // Check if amountPeopleByGender works
        System.out.println(personRepository.amountPeopleByGender(Gender.FEMALE) + " people are female.");

        // check if getPersonByName works
        Optional<Person> optionalPerson2 = personRepository.getPersonByName("Edie");

        if (optionalPerson2.isPresent()) {
            Person person = optionalPerson2.get();
            System.out.println(person.name() + " is here to slay.");
        } else {
            System.out.println("Person not found");
        }

        Optional<Person> optionalPerson11 = personRepository.getPersonByName("Torben");

        if (optionalPerson11.isPresent()) {
            Person person = optionalPerson11.get();
            System.out.println(person.name() + " is here to slay.");
        } else {
            System.out.println("Person not found");
        }

        // check if getAllPersonsByFavoriteWeekday works
        List<Person> mondayLovers = personRepository.getAllPersonsByFavoriteWeekday(DaysOfWeek.MONDAY);
        System.out.println("People who love Monday: ");
        System.out.println(mondayLovers);

    }
}


// RESEARCH

// You are building an online chess game. For the player colors (black and white), you want to define an enum.
// What name could the enum have and how could the two enum constants be named?
// Pay attention to naming conventions.

// public enum PlayerColor {
//    WHITE,
//    BLACK }

// --------------------------

//Would you also use an enum with constants for each chess piece (8 pawns, 2 rooks, 2 bishops, etc.)?
// Why / why not?

// It is generally not recommended to use an enum for each individual chess piece (e.g., Pawn1, Pawn2, Rook1, etc.) because:
//
// Redundancy: Each type of piece already has identical behavior for all instances of that type.
// Defining separate enums for individual pieces does not align with their logical grouping.
// Scalability: If pieces are captured or move, you would have to track them manually if each piece were a
// separate constant.
// Better Representation: Use an enum for piece types (PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING) and combine
// it with other attributes like position and color.

// public enum ChessPieceType {
//    PAWN,
//    ROOK,
//    KNIGHT,
//    BISHOP,
//    QUEEN,
//    KING }

// public class ChessPiece {
//    private ChessPieceType type;
//    private PlayerColor color;
//    private Position position; } // Could represent board position.
//

// --------------------------

// You are coding a member management system for a tax assistance association.
// The variable 'spouse' contains a Java Optional that may store the personal data of a member's spouse.
// Why shouldn't you simply call spouse.get().getFirstName() - what could go wrong here?

// The method spouse.get() assumes that the Optional always contains a value, which violates the
// contract of Optional and can result in a NoSuchElementException if the Optional is empty.
// Instead, you should check if the Optional contains a value before accessing it to ensure the code
// is safe and avoid runtime exceptions.

// import java.util.Optional;
//
//public class Member {
//    private String name;  // Member's name
//    private Optional<Spouse> spouse;  // Optional to store spouse's personal data
//
//    public Member(String name, Optional<Spouse> spouse) {
//        this.name = name;
//        this.spouse = spouse;
//    }
//
//    // Getters
//    public String getName() {
//        return name;
//    }
//
//    public Optional<Spouse> getSpouse() {
//        return spouse;
//    }
//}
//
//class Spouse {
//    private String firstName;
//    private String lastName;
//
//    public Spouse(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    // Getters
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//}

// IN MAIN or wherever
// if (spouse.isPresent()) {
//    String firstName = spouse.get().getFirstName();
//    // Process firstName }
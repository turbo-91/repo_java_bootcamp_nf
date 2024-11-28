package de.neuefische;

import de.neuefische.noisyMusic.*;

public class Main {
    public static void main(String[] args) {

// SESSION
        Instrument violin = new Violin();
        Instrument eGitarre = new EGitarre();

        Screwdriver screwdriver = new Screwdriver();
        Rocket rocket = new Rocket();

        recordNoise(violin);
        recordNoise(screwdriver);
        recordNoise(rocket);

// CHALLENGES


    }

// SESSION

    private static void recordNoise(CanMakeNoise device) {
        System.out.println("Start recording....");
        System.out.println("Recording: " + device.makeNoise());
        System.out.println("Stop recording...");
    }

// CHALLENGE



}

// RESEARCH

//You work for a travel company. For the different modes of transportation, you have decided to define Java classes for each.
//The classes are named: Ship, Plane, Train, Car, Rickshaw, Bike, EScooter.
// You notice that you have implemented methods with the same signature in some of the classes:
// public int getNumberOfWheels() for vehicles and public String getCarbonEmission() for motorized modes of transportation.
//If you were to create an interface for these two methods, what would you name it?
//
// CanTransport


//In C#, there was an outdated convention to include a letter as a prefix in the names of types.
// For example, CString for the Class (C) with strings, or IDisposable for the Interface (I) that marks disposable types.
// Why is this not done in Java and now also rejected by many C# developers?
//
//The rejection of prefixed type names in Java (and increasingly in C#) is due to:
//Improved tooling that makes prefixes redundant.
//A focus on descriptive, meaningful names.
//A desire for consistency and readability.
//An effort to align with modern programming paradigms and standards.
//Modern developers aim to write code that is intuitive and self-explanatory without relying on outdated conventions.
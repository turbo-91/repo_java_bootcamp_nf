package org.pharmacy;

import org.example.ShoppingItem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("Loperamid", 4.99, true));
        pharmacy.save(new Medication("Aspirin", 6.75, false));
        pharmacy.save(new Medication("Fenistil", 12.50, true));

        System.out.println("All Medications");
        pharmacy.printAllMedications();

        System.out.println("Find Aspirin");
        Medication found = pharmacy.find("Aspirin");
        System.out.println("The price of " + found.getName() + " is: " + found.getPrice());

        System.out.println("Delete Fenistil");
        pharmacy.delete("Fenistil");

        System.out.println("Medications in the Pharmacy");
        System.out.println("Total Medications: " + pharmacy.getCount());
    }
}


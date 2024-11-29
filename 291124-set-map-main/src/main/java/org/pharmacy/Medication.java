package org.pharmacy;

public class Medication {
    private String name;
    private double price;
    private boolean availability;

    public Medication(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return availability;
    }
}

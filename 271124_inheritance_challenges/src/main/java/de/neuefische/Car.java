package de.neuefische;

import java.util.Objects;

class Car extends Vehicle {
    private int amountOfDoors;

    public Car(String manufacturer, String model, String year) {
        super(manufacturer, model, year); // Muss immer als erstes erfolgen
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public void getVehicleInformation() {
        super.getVehicleInformation(); 
        System.out.println("Number of Doors: " + amountOfDoors);
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return amountOfDoors == car.amountOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "amountOfDoors=" + amountOfDoors +
                '}';
    }
}

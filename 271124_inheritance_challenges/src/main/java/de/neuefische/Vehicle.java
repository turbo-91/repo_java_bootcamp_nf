package de.neuefische;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;
    private String model;
    private String year;

    public Vehicle(String manufacturer, String model, String year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void getVehicleInformation() {
        System.out.println("Manufacturer: " + manufacturer + " Model: " + model);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model) && Objects.equals(year, vehicle.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}


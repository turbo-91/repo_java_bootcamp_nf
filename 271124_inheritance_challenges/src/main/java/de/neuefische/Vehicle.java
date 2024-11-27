package de.neuefische;

import java.util.Objects;

public class Vehicle {
    private String Manufacturer;
    private String Model;
    private String Year;

    public Vehicle(String Manufacturer, String Model, String Year) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Year = Year;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(Manufacturer, vehicle.Manufacturer) && Objects.equals(Model, vehicle.Model) && Objects.equals(Year, vehicle.Year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Manufacturer, Model, Year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}


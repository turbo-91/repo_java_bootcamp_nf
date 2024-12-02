package org.example;

public record Species(String name, int foodPerDayInGrams) {

    public Species withName (String name){
        return new Species(name, foodPerDayInGrams);
    }

    public Species withFoodPerDayInGrams (int foodPerDayInGrams){
        return new Species(name, foodPerDayInGrams);
    }

}

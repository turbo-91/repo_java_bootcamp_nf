package de.neuefische;

public class Screwdriver implements CanMakeNoise {

    public String makeNoise() {
        return "Some screwdriver noise";
    }

    public String stopNoise() {
        return "Stopped screwdriver";
    }
}

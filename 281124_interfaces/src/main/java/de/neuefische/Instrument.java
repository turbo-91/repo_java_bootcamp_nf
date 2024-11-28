package de.neuefische;

public class Instrument implements CanMakeNoise, CanRunning {
    public String makeNoise() {
        return "Some Music";
    }

    public String stopNoise() {
        return "Stop music";
    }

    public String startRunning() {
        return "Starting running";
    }
}

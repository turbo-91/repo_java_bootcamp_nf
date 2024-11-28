package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Instrument violin = new Violin();
        Instrument eGitarre = new EGitarre();

        Screwdriver screwdriver = new Screwdriver();
        Rocket rocket = new Rocket();

        recordNoise(violin);
        recordNoise(screwdriver);
        recordNoise(rocket);


    }

    private static void recordNoise(CanMakeNoise device) {
        System.out.println("Start recording....");
        System.out.println("Recording: " + device.makeNoise());
        System.out.println("Stop recording...");
    }
}
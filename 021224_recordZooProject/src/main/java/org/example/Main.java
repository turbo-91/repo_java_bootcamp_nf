package org.example;

public class Main {
    public static void main(String[] args) {

        Species catSpecies = new Species("Cat", 800);
        Species pigSpecies = new Species("Pig", 800);
        Species dogSpecies = new Species("Dog", 800);


        Owner tim = new Owner("tim", 55, "Biebricher Straße");
        Owner eva = new Owner("eva", 35, "Landsberger Allee");
        Owner adam = new Owner("adam", 25, "Bergmannstraße");
        Owner tom = new Owner("tom", 44, "Hermannstraße");

        Animal cat = new Animal("1A", "kitty", catSpecies, 4, tim);
        Animal dog = new Animal("2A", "rufus", dogSpecies, 7, eva);
        Animal donkey = new Animal("3A", "dirk", catSpecies, 12, adam);
        Animal pig = new Animal("4A", "ms piggy", pigSpecies, 5, tom);

        System.out.println(pig.toString());
        System.out.println(cat.equals(dog));

    }
}
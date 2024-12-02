package org.example;

public class Main {
    public static void main(String[] args) {

        Owner tim = new Owner("time", 55, "Biebricher Straße");
        Owner eva = new Owner("eva", 35, "Landsberger Allee");
        Owner adam = new Owner("adam", 25, "Bergmannstraße");
        Owner tom = new Owner("tom", 44, "Hermannstraße");

        Animal cat = new Animal("1A", "kitty", "cat", 4, tim);
        Animal dog = new Animal("2A", "rufus", "dog", 7, eva);
        Animal donkey = new Animal("3A", "dirk", "donkey", 12, adam);
        Animal pig = new Animal("4A", "ms piggy", "pig", 5, tom);

        System.out.println(pig.toString());
        System.out.println(cat.equals(dog));

    }
}
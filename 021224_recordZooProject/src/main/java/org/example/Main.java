package org.example;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("1A", "kitty", "cat", 4);
        Animal dog = new Animal("2A", "rufus", "dog", 7);
        Animal donkey = new Animal("3A", "dirk", "donkey", 12);
        Animal pig = new Animal("4A", "ms piggy", "pig", 5);

        System.out.println(pig.toString());
        System.out.println(cat.equals(dog));

    }
}
package org.example;

public record Animal(String ID, String name, String species, int age, Owner owner) {

    public Animal withID(String ID) {
        return new Animal(ID, name, species, age, owner);
    }

    public Animal withName(String name) {
        return new Animal(ID, name, species, age, owner);
    }

    public Animal withSpecies(String species) {
        return new Animal(ID, name, species, age, owner);
    }

    public Animal withAge(int age) {
        return new Animal(ID, name, species, age, owner);
    }

    public Animal withOwner(Owner owner) {
        return new Animal(ID, name, species, age, owner);
    }

}

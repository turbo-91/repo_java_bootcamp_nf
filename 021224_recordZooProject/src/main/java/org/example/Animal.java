package org.example;

public record Animal(String ID, String name, String species, int age) {

    public Animal withID(String ID) {
        return new Animal(ID, name, species, age);
    }

    public Animal withName(String name) {
        return new Animal(name, this.name, this.species, this.age);
    }

    public Animal withSpecies(String species) {
        return new Animal(this.ID, this.name, species, this.age);
    }

    public Animal withAge(int age) {
        return new Animal(this.ID, this.name, this.species, this.age);
    }

}

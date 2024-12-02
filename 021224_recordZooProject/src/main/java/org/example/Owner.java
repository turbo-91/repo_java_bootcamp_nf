package org.example;

public record Owner(String name, int age, String address) {

    public Owner withName(String name) {
        return new Owner(name, age, address);
    }

    public Owner withAge(int age) {
        return new Owner(name, age, address);
    }

    public Owner withAddress(String address) {
        return new Owner(name, age, address);
    }

}

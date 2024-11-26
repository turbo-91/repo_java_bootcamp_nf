package org.example;

public class Person {
    String name;
    int age;
    String pronouns;
    String favoriteHobby;

    public Person( String name, int age, String pronouns, String getFavoriteHobby){
        this.name = name;
        this.age = age;
        this.pronouns = pronouns;
        this.favoriteHobby = getFavoriteHobby;
    }
}

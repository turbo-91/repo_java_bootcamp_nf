package org.example._121224_asterisk.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("asterix")
public record Figure(String id, String name, int age, String job) {
    public Figure withId(String id) {
        return new Figure(id, name, age, job);
    }

    public Figure withName(String name) {
        return new Figure(id, name, age, job);
    }

    public Figure withAge(int age) {
        return new Figure(id, name, age, job);
    }

    public Figure withJob(String job) {
        return new Figure(id, name, age, job);
    }


}

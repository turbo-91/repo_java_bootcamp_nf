package org.example._121224_asterisk.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("asterix")
public record Figure(String id, String name, int age, String occupation) {
    public Figure withId(String id) {
        return new Figure(id, name, age, occupation);
    }

    public Figure withName(String name) {
        return new Figure(id, name, age, occupation);
    }

    public Figure withAge(int age) {
        return new Figure(id, name, age, occupation);
    }

    public Figure withJob(String occupation) {
        return new Figure(id, name, age, occupation);
    }


}

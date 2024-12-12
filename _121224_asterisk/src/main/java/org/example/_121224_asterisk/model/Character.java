package org.example._121224_asterisk.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Character")
public record Character(String id, String name, int age, String profession) {
}

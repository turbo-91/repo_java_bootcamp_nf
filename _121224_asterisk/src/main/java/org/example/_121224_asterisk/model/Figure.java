package org.example._121224_asterisk.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Figure")
public record Figure(String id, String name, int age, String profession) {
}

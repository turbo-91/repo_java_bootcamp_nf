package org.example;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Teacher(String id, String name, String subject) {
}


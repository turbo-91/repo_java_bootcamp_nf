package org.example._121224_asterisk.model;

public record FigureDTO(String id, String name, int age, String job) {
    public FigureDTO withId(String id) {
        return new FigureDTO(id, name, age, job);
    }
}
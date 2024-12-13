package org.example._121224_asterisk.model;

public record FigureDTO(String name, int age, String job) {
    public FigureDTO withId(String id) {
        return new FigureDTO(name, age, job);
    }
}
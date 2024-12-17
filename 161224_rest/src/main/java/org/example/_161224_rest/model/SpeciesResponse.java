package org.example._161224_rest.model;

public record SpeciesResponse(Info info) {
    public record Info(int count) {}
}
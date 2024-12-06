package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@With
public class Student {
    private String id;
    private String name;
    private String address;
    int grade;

    @With
    private String warning;

}

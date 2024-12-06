package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@With
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}

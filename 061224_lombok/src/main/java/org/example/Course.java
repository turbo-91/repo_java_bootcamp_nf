package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}

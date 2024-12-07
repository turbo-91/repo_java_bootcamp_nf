package org.example;

import lombok.*;

import java.util.List;
import java.util.UUID;


@Builder
@Value
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}

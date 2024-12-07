package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityServiceTest {

    List<Student> students = List.of(
            Student.builder().id("1a").name("Nina Fischer").address("Hauptstr. 21").grade(new BigDecimal(3.0)).build(),
            Student.builder().id("2b").name("Tom Holland").address("Schillerstr. 2").grade(new BigDecimal(4.0)).build(),
            Student.builder().id("3c").name("Ella Immer").address("Goethestr. 1").grade(new BigDecimal(1)).build(),
            Student.builder().id("4d").name("Egon Wilder").address("Kantstr. 11").grade(new BigDecimal(6)).build()
    );

    Teacher frauLoch = Teacher
            .builder()
            .id("5e")
            .name("Marlene Loch")
            .subject("Deutsch")
            .build();


    @Test
    public void deutschUnterrichtShouldReturn4(){
        // GIVEN
        Course deutschUnterricht = new Course("7g", "Deutsch", frauLoch, students);
        UniversityService universityService = new UniversityService();
        universityService.setCourse(deutschUnterricht);
        // WHEN
        BigDecimal actual = universityService.averageGradeCourse(deutschUnterricht);

        // THEN
        BigDecimal expected = new BigDecimal(3.5);
        Assertions.assertEquals(expected, actual);

    }


}
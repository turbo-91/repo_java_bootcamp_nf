package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student ninaF = Student
                .builder()
                .id("1a")
                .name("Nina Fischer")
                .address("Hauptstr. 21")
                .grade(3)
                .build();
        Student tomH = Student
                .builder()
                .id("2b")
                .name("Tom Holland")
                .address("Schillerstr. 2")
                .grade(4)
                .build();
        Student ellaI = Student
                .builder()
                .id("3c")
                .name("Ella Immer")
                .address("Goethestr. 1")
                .grade(1)
                .build();
        Student egonW = Student
                .builder()
                .id("4d")
                .name("Egon Wilder")
                .address("Kantstr. 11")
                .grade(6)
                .build();

        Teacher frauLoch = Teacher
                .builder()
                .id("5e")
                .name("Marlene Loch")
                .subject("Deutsch")
                .build();
        Teacher herrKerwer = Teacher
                .builder()
                .id("6f")
                .name("Günther Kerwer")
                .subject("Mathematik")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(ninaF);
        students.add(tomH);
        students.add(egonW);

        Course deutschUnterricht = new Course("7g", "Deutsch", frauLoch, students);
        Course matheUnterricht = Course
                .builder()
                .id("7g")
                .name("Mathematik")
                .teacher(herrKerwer)
                .students(students)
                .build();

        System.out.println("Ninas Adresse: " + ninaF.getAddress());
        ninaF.setAddress("Hegelstr. 21");
        System.out.println("Ninas Adresse nach set: " + ninaF.getAddress());
        System.out.println("Is Nina's grade the same as Egon's? " + ninaF.getAddress().equals(egonW.getGrade()));
        System.out.println("Was ist Ellas Passwort? Es lautet: " + ellaI.hashCode());
        System.out.println("Ich brauche alle Infos über Herr Kerwer, die wir haben! Na logo: " + herrKerwer.toString());
        Student egonWithWarning = egonW.withWarning("Wiederholtes Schnattern während des Unterrichts");
        System.out.println("Egon, du ungezogenes Kind: " + egonWithWarning.getWarning());





    }
}

// RESEARCH

// Find a Lombok annotation that has not been mentioned in the lecture or handout so far.

// The @Slf4j annotation automatically adds a static final Logger field to the class,
// using the SLF4J (Simple Logging Facade for Java) framework.

// @Slf4j
//public class StudentService {
//
//    public void addStudent(String name) {
//        log.info("Adding student: {}", name);
//        // Other logic here
//    }
//}

// -------------------

//What are the advantages of using Lombok annotations compared to manual code creation?

// Reduced Boilerplate Code
//Improved Readability
//Faster Development
//Consistency

// -------------------

//Name one disadvantage of Lombok.

// Since Lombok generates code at compile time, the actual implementation is not visible
// in the source code. This can make debugging more challenging, as the generated code
// is not immediately apparent to developers.
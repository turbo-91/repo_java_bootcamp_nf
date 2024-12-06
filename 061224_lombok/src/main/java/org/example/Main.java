package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student ninaF = new Student("1a", "Nina Fischer", "Hauptstr. 21", 3);
        Student tomH = new Student("2b", "Tom Holland", "Schillerstr. 2", 4);
        Student ellaI = new Student("3c", "Ella Immer", "Goethestr. 1", 1);
        Student EgonW = new Student("4d", "Egon Wilder", "Kantstr. 11", 6);

        Teacher frauLoch = new Teacher("5e", "Marlene Loch", "Deutsch");
        Teacher herrKerwer = new Teacher("6f", "Günther Kerwer", "Mather");

        List<Student> students = new ArrayList<>();
        students.add(ninaF);
        students.add(tomH);
        students.add(EgonW);

        Course deutschUnterricht = new Course("7g", "Deutsch", frauLoch, students);

        System.out.println("Ninas Adresse: " + ninaF.getAddress());
        ninaF.setAddress("Hegelstr. 21");
        System.out.println("Ninas Adresse nach set: " + ninaF.getAddress());
        System.out.println("Is Nina's grade the same as Egon's? " + ninaF.getAddress().equals(EgonW.getGrade()));
        System.out.println("Was ist Ellas Passwort? Es lautet: " + ellaI.hashCode());
        System.out.println("Ich brauche alle Infos über Herr Kerwer, die wir haben! Na logo: " + herrKerwer.toString());




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
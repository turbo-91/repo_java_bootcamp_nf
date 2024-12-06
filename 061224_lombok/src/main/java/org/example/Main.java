package org.example;

public class Main {
    public static void main(String[] args) {

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
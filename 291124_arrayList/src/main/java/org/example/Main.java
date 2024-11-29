package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", "Doe", 101));
        students.add(new Student("Jane", "Smith", 102));
        students.add(new Student("Emily", "Johnson", 103));

        School school = new School();
        school.addStudent(new Student("Max", "Mustermann", 104));
        school.addStudent(new Student("Eva", "Mustermann", 105));
        school.addStudent(new Student("Momo", "Mustermann", 106));
        school.printAllStudents();

        Student foundStudent = school.findStudentById(102);
        if (foundStudent != null) {
            System.out.println("Here is your student: " + foundStudent);
        } else {
            System.out.println("No student found with matching ID.");
        }

    }
}
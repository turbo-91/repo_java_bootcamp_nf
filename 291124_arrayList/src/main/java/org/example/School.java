package org.example;
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void printAllStudents() {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
}
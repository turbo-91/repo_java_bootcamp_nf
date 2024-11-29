package org.school;

import org.school.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
//
//    CODE CHALLENGE LIST

//    private List<Student> students;
//
//    public School() {
//        this.students = new ArrayList<>();
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//        System.out.println("Student added: " + student);
//    }
//
//    public void printAllStudents() {
//            System.out.println("List of students:");
//            for (Student student : students) {
//                System.out.println(student);
//            }
//        }
//
//    public Student findStudentById(int studentId) {
//        for (Student student : students) {
//            if (student.getStudentId() == studentId) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//    public boolean removeStudentById(int studentId) {
//        Student studentToRemove = findStudentById(studentId);
//        if (studentToRemove != null) {
//            students.remove(studentToRemove);
//            return true;
//        } else {
//            return false;
//        }
//    }

//    CODE CHALLENGE SET-MAP

    private HashMap<Integer, Student> students;

    public School() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
        System.out.println("Student added: " + student);
    }

    public Student findStudentById(int studentId) {
        return students.get(studentId); // Returns null if not found
    }

    public boolean removeStudentById(int studentId) {
        Student removedStudent = students.remove(studentId);
        if (removedStudent != null) {
            return true;
        } else {
            return false;
        }
    }

    // Print all students
    public void printAllStudents() {
        if (students.size() == 0) {
            System.out.println("There is no students in that school.");
        } else {
            System.out.println("All students:");
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}
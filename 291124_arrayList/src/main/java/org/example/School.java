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

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudentById(int studentId) {
        Student studentToRemove = findStudentById(studentId);
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            return true;
        } else { 
            return false;
        }
    }

}
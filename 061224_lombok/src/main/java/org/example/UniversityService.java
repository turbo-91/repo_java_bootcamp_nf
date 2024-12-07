package org.example;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class UniversityService {
private University university;
private Course course;

public BigDecimal averageGradeCourse(Course course){
    List<Student> students = course.getStudents();
    BigDecimal grades = new BigDecimal(0);
    BigDecimal counter = new BigDecimal(0);
    for (Student student : students) {
        BigDecimal studentGrade = new BigDecimal(String.valueOf(student.getGrade())); // Assuming getGrade() returns an int
        grades = grades.add(studentGrade);
        counter = counter.add(BigDecimal.ONE);
    }
    return grades.divide(counter);
};

// OPTIMIZED BY CHATgpt

    // public BigDecimal averageGradeCourse(Course course) {
    //    return Optional.ofNullable(course.getStudents()) // Wrap the list of students in an Optional
    //        .filter(students -> !students.isEmpty())     // Ensure the list is not empty
    //        .map(students -> students.stream()
    //            .map(student -> BigDecimal.valueOf(student.getGrade())) // Convert grades to BigDecimal
    //            .reduce(BigDecimal.ZERO, (sum, grade) -> sum.add(grade)) // Accumulate grades
    //            .divide(BigDecimal.valueOf(students.size()), 2, RoundingMode.HALF_UP) // Calculate average
    //        )
    //        .orElseThrow(() -> new IllegalArgumentException("Course has no students.")); // Throw if students are null or empty
    //  }

public BigDecimal averageGradeUniversity(University university){
    List<Course> universityCourses = university.courseList();
    BigDecimal grades = new BigDecimal(0);
    BigDecimal counter = new BigDecimal(0);
    for (Course course : universityCourses) {
        BigDecimal averageGradeCourse = averageGradeCourse(course);
        grades = grades.add(averageGradeCourse);
        counter = counter.add(BigDecimal.ONE);
    }
    return grades.divide(counter);
}

// OPTIMIZED BY CHATgpt

    // public BigDecimal averageGradeUniversity(University university) {
    //    return Optional.ofNullable(university.courseList()) // Wrap the list of courses in an Optional
    //        .filter(courses -> !courses.isEmpty())         // Ensure the list is not empty
    //        .map(courses -> courses.stream()
    //            .map(course -> averageGradeCourse(course)) // Calculate the average for each course
    //            .reduce(BigDecimal.ZERO, (sum, average) -> sum.add(average)) // Accumulate course averages
    //            .divide(BigDecimal.valueOf(courses.size()), 2, RoundingMode.HALF_UP) // Calculate average
    //        )
    //        .orElseThrow(() -> new IllegalArgumentException("University has no courses.")); // Throw if courses are null or empty
    //   }

}

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


}

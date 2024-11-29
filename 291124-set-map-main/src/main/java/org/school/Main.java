package org.school;

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

        Student foundStudent = school.findStudentById(105);
        if (foundStudent != null) {
            System.out.println("Here is your sutdent: " + foundStudent);
        } else {
            System.out.println("No student found with matching ID.");
        }

    }

    // RESEARCH

//    Name one advantage of arrays over lists, such as ArrayList:

//    Arrays have better performance in terms of memory usage and speed when working with fixed-size, homogenous data,
//    as they avoid the overhead of dynamic resizing and boxing/unboxing inherent to lists like ArrayList.
//

    
//    Name 2 methods provided by the List interface that were not mentioned in the lecture or handout. What can they be used for?

//.   subList(int fromIndex, int toIndex): This method returns a view of the portion of the list between the specified indices,
//    which is useful for operations on a segment of the list without creating a new one.
//    replaceAll(UnaryOperator<E> operator): It replaces each element of the list with the result of applying the specified operator,
//    useful for in-place transformations.
//

//
//    Explanation of the compiler error:

//    The error occurs because list.get(2) returns an Object, not a String. This happens if the list is defined as List<Object> or lacks type parameters.
//    To fix this, use generics to define the list as List<String>, ensuring that the compiler knows the list contains strings.
//


//    Cause of the runtime exception:
//    The IndexOutOfBoundsException occurs because the list contains fewer than three elements, and you're attempting to access index 2.
//    Ensure that the list has at least three elements before accessing index 2 to avoid this error.


}
import org.junit.Test;

import javax.management.InstanceNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
public class StudentRepoTest {

    @org.junit.jupiter.api.Test

    @Test
    public void testFindStudentByIdSuccess() throws InstanceNotFoundException {
        // GIVEN
        StudentRepo repo = new StudentRepo();
        Student student = new Student("123", "Alice", "Math");
        repo.save(student);

        // WHEN
        Student foundStudent = repo.findStudentById("123");

        // THEN
        assertEquals(student, foundStudent);
    }

    @Test
    public void testFindStudentByIdNotFound() {
        // GIVEN
        StudentRepo repo = new StudentRepo();

        // WHEN
        // We try to find a student with a non-existent ID

        // THEN: An InstanceNotFoundException is thrown
        assertThrows(InstanceNotFoundException.class, () -> {
            repo.findStudentById("non-existent-id");
        });
    }

}
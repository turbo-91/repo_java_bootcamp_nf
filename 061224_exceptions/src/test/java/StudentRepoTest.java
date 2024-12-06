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
    public void testFindStudentByIdNotFound() throws InstanceNotFoundException {
        // GIVEN
        StudentRepo repo = new StudentRepo();
        Student student = new Student("123", "Alice", "Math");
        repo.save(student);

        // WHEN & THEN
        assertThrows(InstanceNotFoundException.class, () -> {
            repo.findStudentById("Käsekuchen");
        });
    }

}
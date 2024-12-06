import java.util.*;
import javax.management.InstanceNotFoundException;


public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findStudentById(String id) throws InstanceNotFoundException {
        for (Student student : students.values()) {
            if (student.id().equals(id)) {
                return student;
            }
        }
        throw new InstanceNotFoundException("Student with ID " + id + " not found.");
    }
}

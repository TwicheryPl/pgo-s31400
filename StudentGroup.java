import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();

    StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws IllegalStateException {
        if (this.students.size() >= 15) {
            throw new IllegalStateException("Number of students in a group cannot exceed 15");
        } else if (this.students.contains(student)) {
            throw new IllegalStateException("Student already in a group");
        }
        this.students.add(student);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGroupTest {

    public static StudentGroup getExampleStudentGroup() {
        return new StudentGroup("Test Group");
    }

    @Test
    void addStudent() {
        StudentGroup group = getExampleStudentGroup();
        Student student = StudentTest.getExampleStudent();
        group.addStudent(student);
        assertTrue(group.students.contains(student));
    }

    @Test
    public void addStudentExceedLimit() {
        StudentGroup group = getExampleStudentGroup();
        assertThrows(IllegalStateException.class, () -> {
            for (int i = 0; 15 >= i; i++) {
                Student student = StudentTest.getExampleStudent("Joe" + i, "Mama");
                group.addStudent(student);
            }
        });
    }

    @Test void addStudentDuplicate() {
        StudentGroup group = getExampleStudentGroup();
        Student student = StudentTest.getExampleStudent();
        assertThrows(IllegalStateException.class, () -> {
            group.addStudent(student);
            group.addStudent(student);
        });
    }
}
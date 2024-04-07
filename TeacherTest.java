import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    public static Teacher getExampleTeacher() {
        return new Teacher("Joe", "Mama", "joe.mama@example.com");
    }

    public static Subject getExampleSubject() {
        return new Subject("Math", "class", 100);
    }

    @Test
    void addSubject() {
        Teacher teacher = getExampleTeacher();
        assertThrows(IllegalStateException.class, () -> {
            for (int i = 0; i <= 30; i++) {
                Subject subject = getExampleSubject();
                teacher.addSubject(subject);
            }
        });
    }

    @Test
    void calculateSalary() {
        Teacher teacher = getExampleTeacher();
        List<Integer> rates = Arrays.asList(100, 200, 100);
        for (int rate : rates) {
            Subject subject = getExampleSubject();
            subject.rate = rate;
            teacher.addSubject(subject);
        }
        Subject lecture = getExampleSubject();
        lecture.type = "lecture";
        lecture.rate = 100;
        teacher.subjects.add(lecture);
        assertEquals(520 * 15, teacher.calculateSalary());
    }
}
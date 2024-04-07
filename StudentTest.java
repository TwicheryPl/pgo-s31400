import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    public static Student getExampleStudent() {
        return new Student("Joe", "Mama", "s30801", "joe.mama@example.com", "Uwu Street 69");
    }

   public static Student getExampleStudent(String fname, String lname) {
        Student student = getExampleStudent();
        student.fname = fname;
        student.lname = lname;
        return student;
   }

    @Test
    void getNearestValue() {
        List<Double> grades = Arrays.asList(2.0, 2.5, 3.0, 3.5, 3.5, 4.0, 4.5, 6.0);
        Student student = getExampleStudent();
        student.grades = grades;
        assertEquals(3.5, student.getGradesAverageNearest());
    }

    @Test
    void getGradesAverage() {
        List<Double> grades = Arrays.asList(2.0, 2.5, 3.0, 3.5, 3.5, 4.0, 4.5, 6.0);
        Student student = getExampleStudent();
        student.grades = grades;
        assertEquals(3.625, student.getGradesAverage());
    }
}
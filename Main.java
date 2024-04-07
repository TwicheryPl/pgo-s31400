import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = StudentTest.getExampleStudent();
        List<Double> grades = Arrays.asList(2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0);
        student.grades = grades;
        System.out.println(student.getGradesAverage());
        System.out.println(student.getGradesAverageNearest());

        Teacher teacher = TeacherTest.getExampleTeacher();
        List<Integer> rates = Arrays.asList(100, 200, 100);
        for (int rate : rates) {
            Subject subject = TeacherTest.getExampleSubject();
            subject.rate = rate;
            teacher.addSubject(subject);
        }
        Subject lecture = TeacherTest.getExampleSubject();
        lecture.type = "lecture";
        lecture.rate = 100;
        teacher.subjects.add(lecture);
        System.out.println(teacher.calculateSalary());
    }
}
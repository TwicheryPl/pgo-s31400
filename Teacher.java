import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public String fname;
    public String lname;
    public String email;
    public List<Subject> subjects = new ArrayList<>();

    public Teacher(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public void addSubject(Subject subject) throws IllegalStateException {
        subject.teacher = this;
        if (this.subjects.size() >= 30) {
            throw new IllegalStateException("Bruh cant do more than 30 string");
        }
        subjects.add(subject);
    }

    public double calculateSalary() {
        double salary = 0;
        for (Subject subject : this.subjects) {
            double rate = Double.valueOf(subject.rate);
            salary += rate * ((subject.type.toLowerCase().equals("lecture") ? 1.2 : 1.0));
        }
        return salary * 15;
    }
}
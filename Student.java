import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades;

    Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    public static double getNearestValue(List<Double> values, double targetValue) {
        double minDiff = Double.MAX_VALUE;
        double closestValue = 0;
        for (double value : values) {
            double diff = Math.abs(targetValue - value);
            if (diff < minDiff) {
                minDiff = diff;
                closestValue = value;
            }
        }
        return closestValue;
    }

    public static double calculateAverage(List<Double> numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

   public double getGradesAverage() throws IllegalArgumentException {
        if (this.grades.isEmpty()) {
            throw new IllegalArgumentException("List of grades cannot be empty");
        }
        return calculateAverage(this.grades);
   }

   public double getGradesAverageNearest() throws IllegalArgumentException {
        return getNearestValue(this.grades, getGradesAverage());
   }
}

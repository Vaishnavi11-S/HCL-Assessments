import java.util.*;
abstract class Course {
    double courseFee;
    Course(double courseFee) {
        this.courseFee = courseFee;
    }
    abstract double calculateDiscount();
    abstract String getCourseType();
    double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}
class ProgrammingCourse extends Course {
    ProgrammingCourse(double courseFee) {
        super(courseFee);
    }
    @Override
    double calculateDiscount() {
        return courseFee * 10 / 100;
    }
    @Override
    String getCourseType() {
        return "Programming";
    }
}
class DataScienceCourse extends Course {
    DataScienceCourse(double courseFee) {
        super(courseFee);
    }
    @Override
    double calculateDiscount() {
        return courseFee * 15 / 100;
    }
    @Override
    String getCourseType() {
        return "Data Science";
    }
}
class CloudCourse extends Course {
    CloudCourse(double courseFee) {
        super(courseFee);
    }
    @Override
    double calculateDiscount() {
        return courseFee * 5 / 100;
    }
    @Override
    String getCourseType() {
        return "Cloud";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int courseType = sc.nextInt();
        double courseFee = sc.nextDouble();
        Course c;
        if (courseType == 1) {
            c = new ProgrammingCourse(courseFee);
        } else if (courseType == 2) {
            c = new DataScienceCourse(courseFee);
        } else {
            c = new CloudCourse(courseFee);
        }
        System.out.println("Course Type: " + c.getCourseType());
        System.out.printf("Discount: %.2f%n", c.calculateDiscount());
        System.out.printf("Final Fee: %.2f%n", c.calculateFinalFee());
        sc.close();
    }
}

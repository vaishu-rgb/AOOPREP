package javagenericsandfunctionalprogramming;
import java.util.*;
import java.util.function.*;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Riya", 78.5),
            new Student("Aman", 72.0),
            new Student("Neha", 88.0)
        );

        Predicate<Student> isAbove75 = s -> s.grade > 75;
        Consumer<Student> display = s -> System.out.println(s.name + " - " + s.grade + "%");

        students.stream().filter(isAbove75).forEach(display);
    }
}
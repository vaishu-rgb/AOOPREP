package sortingandstreamapi;
import java.util.*;

class Candidate {
    String name;
    double cgpa;
    int yearOfPassing;

    Candidate(String name, double cgpa, int year) {
        this.name = name;
        this.cgpa = cgpa;
        this.yearOfPassing = year;
    }

    public String toString() {
        return name + " - CGPA: " + cgpa + " - Year: " + yearOfPassing;
    }
}

public class StudentPlacement {
    public static void main(String[] args) {
        List<Candidate> candidates = Arrays.asList(
            new Candidate("Vaishnavi", 9.2, 2024),
            new Candidate("Ravi", 8.5, 2023),
            new Candidate("Neha", 9.2, 2023)
        );

        candidates.sort(Comparator.comparingDouble((Candidate c) -> -c.cgpa)
            .thenComparingInt(c -> c.yearOfPassing));

        candidates.forEach(System.out::println);
    }
}
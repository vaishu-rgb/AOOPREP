package sortingandstreamapi;
import java.util.*;
import java.util.stream.*;

public class LearningPlatform {
    public static void main(String[] args) {
        List<Double> scores = Arrays.asList(58.0, 72.5, 89.0, 65.0, 45.0);

        List<String> grades = scores.stream()
            .filter(score -> score > 60)
            .map(score -> {
                if (score >= 85) return "A";
                else if (score >= 70) return "B";
                else return "C";
            })
            .collect(Collectors.toList());

        System.out.println("Grades: " + grades);
        System.out.println("\nStream API's filter() selects relevant data, while map() transforms it efficiently.");
    }
}
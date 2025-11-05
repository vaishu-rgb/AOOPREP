package sortingandstreamapi;
import java.util.*;

class Athlete implements Comparable<Athlete> {
    String name;
    String country;
    int score;

    Athlete(String name, String country, int score) {
        this.name = name;
        this.country = country;
        this.score = score;
    }

    public int compareTo(Athlete other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " (" + country + ") - Score: " + score;
    }
}

public class SportsAnalytics {
    public static void main(String[] args) {
        List<Athlete> athletes = Arrays.asList(
            new Athlete("Zara", "India", 85),
            new Athlete("Aman", "UK", 90),
            new Athlete("Neha", "USA", 75)
        );

        System.out.println("Sorted by name:");
        Collections.sort(athletes);
        athletes.forEach(System.out::println);

        System.out.println("\nSorted by score:");
        athletes.sort((a1, a2) -> Integer.compare(a2.score, a1.score));
        athletes.forEach(System.out::println);

        System.out.println("\nUse Comparable for natural ordering (e.g., name), Comparator for flexible sorting (e.g., score).");
    }
}
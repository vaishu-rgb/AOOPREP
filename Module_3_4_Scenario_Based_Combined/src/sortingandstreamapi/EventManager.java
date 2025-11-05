package sortingandstreamapi;
import java.util.*;

class Event implements Comparable<Event> {
    String name;
    String date; // Format: YYYY-MM-DD
    int attendance;

    Event(String name, String date, int attendance) {
        this.name = name;
        this.date = date;
        this.attendance = attendance;
    }

    public int compareTo(Event other) {
        return this.date.compareTo(other.date);
    }

    public String toString() {
        return name + " - Date: " + date + " - Attendance: " + attendance;
    }
}

public class EventManager {
    public static void main(String[] args) {
        List<Event> events = Arrays.asList(
            new Event("TechFest", "2025-11-10", 500),
            new Event("Hackathon", "2025-10-05", 300),
            new Event("Seminar", "2025-12-01", 450)
        );

        System.out.println("Sorted by date:");
        Collections.sort(events);
        events.forEach(System.out::println);

        System.out.println("\nSorted by attendance:");
        events.sort((e1, e2) -> Integer.compare(e2.attendance, e1.attendance));
        events.forEach(System.out::println);

        System.out.println("\nComparable is ideal for natural order (e.g., date), Comparator for custom logic (e.g., attendance).");
    }
}
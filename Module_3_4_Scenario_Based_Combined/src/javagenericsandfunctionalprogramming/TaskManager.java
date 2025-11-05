package javagenericsandfunctionalprogramming;
import java.util.*;
import java.util.stream.*;

class Task {
    String title;
    String priority;
    String dueDate;

    Task(String title, String priority, String dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
            new Task("Submit report", "High", "2025-11-10"),
            new
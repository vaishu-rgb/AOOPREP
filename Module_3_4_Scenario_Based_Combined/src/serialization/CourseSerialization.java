package serialization;
import java.io.*;
import java.util.*;

class Course implements Serializable {
    String courseId;
    String title;
    int credits;
    transient String instructorNotes;

    Course(String courseId, String title, int credits, String notes) {
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
        this.instructorNotes = notes;
    }
}

public class CourseSerialization {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
            new Course("C101", "Java Programming", 4, "Focus on OOP"),
            new Course("C102", "Data Structures", 3, "Use visual aids"),
            new Course("C103", "Algorithms", 4, "Include real-world problems")
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("courses.ser"))) {
            out.writeObject(courses);
            System.out.println("Courses serialized.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("courses.ser"))) {
            List<Course> deserialized = (List<Course>) in.readObject();
            for (Course c : deserialized) {
                System.out.println("Course ID: " + c.courseId + ", Title: " + c.title + ", Credits: " + c.credits + ", Notes: " + c.instructorNotes);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
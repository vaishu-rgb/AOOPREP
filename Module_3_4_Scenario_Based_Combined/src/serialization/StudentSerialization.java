package serialization;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    String name;
    int id;
    double grade;
    transient String password;

    Student(String name, int id, double grade, String password) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.password = password;
    }
}

public class StudentSerialization {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 101, 88.5, "pass123"),
            new Student("Bob", 102, 92.0, "secret456")
        );

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            out.writeObject(students);
            System.out.println("Students serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.ser"))) {
            List<Student> deserialized = (List<Student>) in.readObject();
            for (Student s : deserialized) {
                System.out.println("Name: " + s.name + ", ID: " + s.id + ", Grade: " + s.grade + ", Password: " + s.password);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
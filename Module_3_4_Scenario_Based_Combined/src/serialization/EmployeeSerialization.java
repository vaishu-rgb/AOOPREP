package serialization;
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSerializer {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(201, "John", 55000),
            new Employee(202, "Jane", 62000)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(employees);
            System.out.println("Employees serialized to employees.dat");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
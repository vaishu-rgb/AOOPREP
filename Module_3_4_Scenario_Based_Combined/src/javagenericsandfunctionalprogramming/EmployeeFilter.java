package javagenericsandfunctionalprogramming;
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String dept, double salary) {
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 65000)
        );

        List<String> itNames = employees.stream()
            .filter(e -> e.department.equals("IT"))
            .map(e -> e.name)
            .collect(Collectors.toList());

        System.out.println("IT Employees: " + itNames);
    }
}

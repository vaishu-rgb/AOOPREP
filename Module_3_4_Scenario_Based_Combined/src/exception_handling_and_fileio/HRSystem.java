package exception_handling_and_fileio;
import java.io.*;

class Employee implements Serializable {
    String name;
    int id;
    double salary;
    transient String password;

    Employee(String name, int id, double salary, String password) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.password = password;
    }
}

public class HRSystem {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("Alice", 101, 50000, "secret123");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee e = (Employee) in.readObject();
            System.out.println("Name: " + e.name + ", ID: " + e.id + ", Salary: " + e.salary + ", Password: " + e.password);
        }
    }
}
package assignment1;

import java.util.Scanner;

class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; 
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("---------------------------");
    }

    static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + employeeCount);
    }
}

public class EmployeeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            employees[i] = new Employee(name, id);
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        Employee.displayTotalEmployees();

        sc.close();
    }
}

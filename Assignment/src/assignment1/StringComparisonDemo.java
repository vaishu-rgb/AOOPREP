package assignment1;

import java.util.Scanner;

public class StringComparisonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two student names
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        // Creating a new String object explicitly
        String name3 = new String(name1);

        System.out.println("\n--- Comparison Results ---");

        // Reference comparison
        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name1 == name3: " + (name1 == name3));

        // Content comparison
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name1.equals(name3): " + name1.equals(name3));

        // Case-insensitive comparison
        System.out.println("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2));

        sc.close();
    }
}
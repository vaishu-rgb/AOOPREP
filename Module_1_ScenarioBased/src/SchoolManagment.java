import java.util.Scanner;

class Teacher {
    private String name;
    private int id;
    private String subject;
    private static int idCounter = 1000;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = ++idCounter;
    }

    public void displayDetails() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("----------------------");
    }
}

public class SchoolManagment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(name, subject);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher t : teachers) {
            t.displayDetails();
        }

        sc.close();
    }
}

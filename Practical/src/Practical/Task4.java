package Practical;

import java.util.Scanner;

abstract class Persona {
    protected String identifier;

    public Persona(String identifier) {
        this.identifier = identifier;
    }

    abstract void revealRole();
}

class Sentinel extends Persona {
    public Sentinel(String identifier) {
        super(identifier);
    }

    
    void revealRole() {
        System.out.println(" Role: Admin — " + identifier);
    }

    void manageSystem() {
        System.out.println(identifier + " is managing system configurations.");
    }
}

class Learner extends Persona {
    public Learner(String identifier) {
        super(identifier);
    }

    
    void revealRole() {
        System.out.println(" Role: Student — " + identifier);
    }

    void submitAssignment() {
        System.out.println(identifier + " is submitting an assignment.");
    }
}

class Mentor extends Persona {
    public Mentor(String identifier) {
        super(identifier);
    }

    
    void revealRole() {
        System.out.println(" Role: Faculty — " + identifier);
    }

    void gradeAssignment() {
        System.out.println(identifier + " is grading assignments.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);

        System.out.print("Enter Admin name: ");
        Persona admin = new Sentinel(inputStream.nextLine());

        System.out.print("Enter Student name: ");
        Persona student = new Learner(inputStream.nextLine());

        System.out.print("Enter Faculty name: ");
        Persona faculty = new Mentor(inputStream.nextLine());

        System.out.println("\n Displaying Roles:");
        admin.revealRole();
        student.revealRole();
        faculty.revealRole();

        System.out.println("\n Role-Specific Actions:");
        ((Sentinel) admin).manageSystem();
        ((Learner) student).submitAssignment();
        ((Mentor) faculty).gradeAssignment();

        inputStream.close();
    }
}
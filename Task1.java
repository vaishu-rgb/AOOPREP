package Practical;
import java.util.*;

class Student {
    String name;
    int rollNo;
    int[] marks;

    void setter(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void getter() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll No of the Student: " + rollNo);
        System.out.println("Marks of the Student:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the Student: ");
        String name = sc.next();

        System.out.print("Enter Roll No of the Student: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student st = new Student();
        st.setter(name, rollNo, marks);
        st.getter();

        sc.close();
    }
}
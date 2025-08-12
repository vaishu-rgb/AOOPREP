package assignment1;

import java.util.Scanner;

public class ExamCellProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine(); 

        String[] studentNames = new String[numStudents];
        int[][] marks = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();

            System.out.println("Enter marks for " + studentNames[i] + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine(); 
        }

        System.out.println("\nStudents who passed all subjects:");
        System.out.println("----------------------------------");

        for (int i = 0; i < numStudents; i++) {
            boolean passedAll = true;
            for (int j = 0; j < numSubjects; j++) {
                if (marks[i][j] < 35) {
                    passedAll = false;
                    break;
                }
            }
            if (passedAll) {
                System.out.println(studentNames[i]);
            }
        }

        sc.close();
    }
}
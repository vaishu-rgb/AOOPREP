package basic;

import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        int i = (int) d; 

        System.out.println("Original double value: " + d);
        System.out.println("Converted int value: " + i);
        sc.close();
    }
}
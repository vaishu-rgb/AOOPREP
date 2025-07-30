package basic;

import java.util.Scanner;

public class P_11 {
 public static void main(String[] args) {
     final double PI = 3.14159;

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter radius of the circle: ");
     double radius = scanner.nextDouble();

     double area = PI * radius * radius;
     double circumference = 2 * PI * radius;

     System.out.println("Area = " + area);
     System.out.println("Circumference = " + circumference);
     scanner.close();
 }
}

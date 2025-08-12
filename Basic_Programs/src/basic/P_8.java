package basic;


import java.util.Scanner;

public class P_8 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter first number: ");
     int num1 = sc.nextInt();

     System.out.print("Enter second number: ");
     int num2 = sc.nextInt();

     System.out.println("Addition (+): " + (num1 + num2));
     System.out.println("Subtraction (-): " + (num1 - num2));
     System.out.println("Multiplication (*): " + (num1 * num2));

     if (num2 != 0) {
         System.out.println("Division (/): " + (num1 / num2));
         System.out.println("Modulus (%): " + (num1 % num2));
     } else {
         System.out.println("Division and modulus not possible (division by zero).");
     }
     sc.close();
 }
}
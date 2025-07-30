package basic;

import java.util.Scanner;

public class P_7 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter three numbers: ");
     double num1 = sc.nextDouble();
     double num2 = sc.nextDouble();
     double num3 = sc.nextDouble();

     double average = (num1 + num2 + num3) / 3;

     System.out.println("Average = " + average);
     
     System.out.println("\nExplanation:");
     System.out.println(" '+' has higher precedence than '/' but both are left-associative.");
     System.out.println(" Parentheses ensure addition occurs first → (num1 + num2 + num3)");
     System.out.println(" The result of the sum is then divided by 3.");
     System.out.println(" This guarantees accurate average calculation.");
     sc.close();
     
 }
}
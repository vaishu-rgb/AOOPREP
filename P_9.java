package basic;


import java.util.Scanner;

public class P_9 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter two integers: ");
     int a = scanner.nextInt();
     int b = scanner.nextInt();

     System.out.println("a = " + a + " → " + Integer.toBinaryString(a));
     System.out.println("b = " + b + " → " + Integer.toBinaryString(b));

     System.out.println("\na & b = " + (a & b) + " → " + Integer.toBinaryString(a & b));
     System.out.println("a | b = " + (a | b) + " → " + Integer.toBinaryString(a | b));
     System.out.println("a ^ b = " + (a ^ b) + " → " + Integer.toBinaryString(a ^ b));
     System.out.println("a << 1 = " + (a << 1) + " → " + Integer.toBinaryString(a << 1));
     System.out.println("b >> 1 = " + (b >> 1) + " → " + Integer.toBinaryString(b >> 1));
     scanner.close();
 }
}
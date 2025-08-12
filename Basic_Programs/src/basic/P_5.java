package basic;

import java.util.Scanner;

public class P_5 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter a character: ");
     char inputChar = sc.next().charAt(0);

     int asciiValue = (int) inputChar;

     System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);
     System.out.println("Converted to integer: " + asciiValue);
     sc.close();
     
 }
}
package basic;

public class P_12 {
 public static void main(String[] args) {
     final int FIXED_VALUE = 100;
     System.out.println("Initial value: " + FIXED_VALUE);

     System.out.println("You cannot change a final variable. Java will throw:");
     System.out.println("Error: cannot assign a value to final variable 'FIXED_VALUE'");
 }
}
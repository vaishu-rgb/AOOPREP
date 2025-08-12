package basic;

public class P_6 {
 public static void main(String[] args) {
     int expr1 = 10 + 2 * 5;
     int expr2 = (10 + 2) * 5;
     int expr3 = 100 / 5 + 2 * 3 - 4;

     System.out.println("10 + 2 * 5 = " + expr1);
     System.out.println("(10 + 2) * 5 = " + expr2);
     System.out.println("100 / 5 + 2 * 3 - 4 = " + expr3);

     System.out.println("\nExplanation:");
     System.out.println("Expression 1: '*' has higher precedence than '+', so 2 * 5 is evaluated first → 10 + 10 = 20");
     System.out.println("Expression 2: Parentheses override precedence, so (10 + 2) = 12 → 12 * 5 = 60");
     System.out.println("Expression 3: '/' and '*' have higher precedence and are left-associative:");
     System.out.println("→ 100 / 5 = 20, then 2 * 3 = 6 → 20 + 6 = 26 → 26 - 4 = 22");
 }
}
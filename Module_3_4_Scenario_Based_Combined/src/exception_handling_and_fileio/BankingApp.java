package exception_handling_and_fileio;
public class BankingApp {
    public static void main(String[] args) {
        String accountHolder = null;
        Integer balance = 1000;
        try {
            try {
                System.out.println("Account Holder: " + accountHolder.toUpperCase()); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Error: Account holder name is missing.");
            } finally {
                System.out.println("Checked account holder info.");
            }

            try {
                int transferAmount = 0;
                int result = balance / transferAmount; // ArithmeticException
                System.out.println("Transferred: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Invalid transfer amount.");
            } finally {
                System.out.println("Transfer attempt completed.");
            }
        } catch (Exception e) {
            System.out.println("General error occurred.");
        } finally {
            System.out.println("Banking operation finished.");
        }
    }
}
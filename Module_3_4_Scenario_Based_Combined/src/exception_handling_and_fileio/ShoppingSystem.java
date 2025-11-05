package exception_handling_and_fileio;
public class ShoppingSystem {
    public static void main(String[] args) {
        String customer = null;
        int quantity = -5;

        try {
            try {
                System.out.println("Customer: " + customer.toUpperCase()); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Missing customer details.");
            }

            try {
                if (quantity <= 0) throw new IllegalArgumentException("Invalid quantity.");
                System.out.println("Order placed for quantity: " + quantity);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } finally {
            System.out.println("Order processing completed.");
        }
    }
}
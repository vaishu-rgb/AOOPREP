import java.util.Scanner;

public class LoginSystem {
    private String storedUsername;

    public LoginSystem(String username) {
        // Simulates storing a username from the database
        this.storedUsername = username;
    }

    public void validateLogin(String inputUsername) {
        System.out.println("Stored username: " + storedUsername);
        System.out.println("Entered username: " + inputUsername);

        // Check using equals()
        if (storedUsername.equals(inputUsername)) {
            System.out.println("✅ equals(): Usernames match in content.");
        } else {
            System.out.println("❌ equals(): Usernames do NOT match in content.");
        }

        // Check using ==
        if (storedUsername == inputUsername) {
            System.out.println("✅ == : Both references point to the same String object.");
        } else {
            System.out.println("❌ == : References point to different String objects.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate database username stored using string literal (goes to string pool)
        LoginSystem system = new LoginSystem("Vaishnavi");

        System.out.print("Enter username: ");
        String input = scanner.nextLine();

        system.validateLogin(input);
        scanner.close();
    }
}
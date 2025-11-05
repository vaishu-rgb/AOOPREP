package exception_handling_and_fileio;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class VoterPortal {
    static void register(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age below 18 not allowed.");
        }
        System.out.println(name + " registered successfully.");
    }

    public static void main(String[] args) {
        try {
            register("John", 20);
            register("Tim", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
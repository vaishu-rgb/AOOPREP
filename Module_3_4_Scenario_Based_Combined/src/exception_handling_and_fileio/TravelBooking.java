package exception_handling_and_fileio;
class InvalidDestinationException extends Exception {
    InvalidDestinationException(String msg) {
        super(msg);
    }
}

public class TravelBooking {
    static void book(String destination) throws InvalidDestinationException {
        String[] valid = {"Paris", "Tokyo", "New York"};
        for (String d : valid) {
            if (d.equalsIgnoreCase(destination)) {
                System.out.println("Booking confirmed for " + destination);
                return;
            }
        }
        throw new InvalidDestinationException("Invalid destination: " + destination);
    }

    public static void main(String[] args) {
        try {
            book("Tokyo");
            book("Atlantis");
        } catch (InvalidDestinationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
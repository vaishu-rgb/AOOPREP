package exception_handling_and_fileio;
class LateCheckInException extends Exception {
    LateCheckInException(String msg) {
        super(msg);
    }
}

class FlightCheckIn {
    void checkIn(int minutesBeforeDeparture) throws LateCheckInException {
        if (minutesBeforeDeparture < 30) {
            throw new LateCheckInException("Check-in too late!");
        } else {
            System.out.println("Check-in successful.");
        }
    }
}

public class FlightApp {
    public static void main(String[] args) {
        FlightCheckIn fc = new FlightCheckIn();
        try {
            fc.checkIn(45); // Successful
            fc.checkIn(20); // Throws exception
        } catch (LateCheckInException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
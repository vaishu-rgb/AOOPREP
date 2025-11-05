package serialization;
import java.io.*;
import java.util.*;

class Ticket implements Serializable {
    String ticketId;
    String eventName;
    double price;

    Ticket(String ticketId, String eventName, double price) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
    }
}

public class TicketManager {
    public static void main(String[] args) {
        List<Ticket> tickets = Arrays.asList(
            new Ticket("T001", "Concert", 1200),
            new Ticket("T002", "Play", 800),
            new Ticket("T003", "Expo", 500),
            new Ticket("T004", "Seminar", 1000)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tickets.ser"))) {
            out.writeObject(tickets);
            System.out.println("Tickets serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("tickets.ser"))) {
            List<Ticket> deserialized = (List<Ticket>) in.readObject();
            for (Ticket t : deserialized) {
                System.out.println("Ticket ID: " + t.ticketId + ", Event: " + t.eventName + ", Price: " + t.price);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
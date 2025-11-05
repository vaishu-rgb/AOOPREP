package fileio;
import java.io.*;
import java.util.*;

public class RestaurantOrderLogger {
    public static void appendOrders(List<String> orders) {
        try (FileWriter fw = new FileWriter("orders.log", true)) {
            for (String order : orders) {
                fw.write(order + "\n");
            }
            System.out.println("Orders appended successfully.");
        } catch (IOException e) {
            System.out.println("Error writing orders: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        orders.add("2025-10-13 12:30: Pizza $15");
        orders.add("2025-10-13 13:00: Pasta $12");
        appendOrders(orders);
    }
}
package serialization;
import java.io.*;
import java.util.*;

class Vehicle implements Serializable {
    String vehicleId;
    String model;
    double rate;

    Vehicle(String vehicleId, String model, double rate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.rate = rate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Vehicle("V001", "Sedan", 1500),
            new Vehicle("V002", "SUV", 2000)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicles.dat"))) {
            out.writeObject(vehicles);
            System.out.println("Vehicles serialized to vehicles.dat");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
package serialization;
import java.io.*;
import java.util.*;

class Product implements Serializable {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(301, "Laptop", 75000),
            new Product(302, "Phone", 45000),
            new Product(303, "Tablet", 30000)
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inventory.dat"))) {
            out.writeObject(products);
            System.out.println("Products serialized to inventory.dat");
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}
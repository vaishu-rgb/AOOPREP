package javagenericsandfunctionalprogramming;
import java.util.*;

class Product {
    String productName;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.productName = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return productName + " - ₹" + price + " - Rating: " + rating;
    }
}

public class ProductSorter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 75000, 4.5),
            new Product("Phone", 50000, 4.7),
            new Product("Tablet", 30000, 4.5)
        );

        products.sort((p1, p2) -> {
            int cmp = Double.compare(p2.rating, p1.rating);
            return cmp != 0 ? cmp : Double.compare(p1.price, p2.price);
        });

        products.forEach(System.out::println);
    }
}
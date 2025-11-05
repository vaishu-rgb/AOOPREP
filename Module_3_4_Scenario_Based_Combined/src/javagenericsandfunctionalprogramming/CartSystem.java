package javagenericsandfunctionalprogramming;
import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void showCart() {
        items.forEach(System.out::println);
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class CartSystem {
    public static void main(String[] args) {
        Cart<String> stringCart = new Cart<>();
        stringCart.addItem("Notebook");
        stringCart.addItem("Pen");

        Cart<Product> productCart = new Cart<>();
        productCart.addItem(new Product("Shoes", 2500));
        productCart.addItem(new Product("Bag", 1500));

        System.out.println("String Cart:");
        stringCart.showCart();

        System.out.println("Product Cart:");
        productCart.showCart();
    }
}
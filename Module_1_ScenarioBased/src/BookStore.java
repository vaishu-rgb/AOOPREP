import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book details:");

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Book book = new Book(title, author, price);

        System.out.println("\nBook Created:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: ₹" + book.getPrice());

        System.out.print("\nEnter new price to update: ");
        double newPrice = scanner.nextDouble();
        book.setPrice(newPrice);

        System.out.println("Updated Price: ₹" + book.getPrice());

        scanner.close();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    {
        System.out.println("Welcome to the Online Bookstore! A new book is being added.");
    }

    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. It cannot be empty.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author name. It cannot be empty.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Must be positive.");
        }
    }
}
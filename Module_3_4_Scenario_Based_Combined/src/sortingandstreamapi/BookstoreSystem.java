package sortingandstreamapi;
import java.util.*;

class Book {
    String title;
    double price;
    int publicationYear;

    Book(String title, double price, int year) {
        this.title = title;
        this.price = price;
        this.publicationYear = year;
    }

    public String toString() {
        return title + " - ₹" + price + " - Year: " + publicationYear;
    }
}

public class BookstoreSystem {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", 500.0, 2020),
            new Book("Advanced Java", 500.0, 2022),
            new Book("Data Structures", 450.0, 2019)
        );

        books.sort(Comparator.comparingDouble((Book b) -> -b.price)
            .thenComparing(b -> b.title));

        books.forEach(System.out::println);
    }
}
package sortingandstreamapi;
import java.util.*;

class Medicine {
    String name;
    double price;
    int expiryYear;

    Medicine(String name, double price, int expiryYear) {
        this.name = name;
        this.price = price;
        this.expiryYear = expiryYear;
    }

    public String toString() {
        return name + " - ₹" + price + " - Expiry: " + expiryYear;
    }
}

public class PharmacyInventory {
    public static void main(String[] args) {
        List<Medicine> meds = Arrays.asList(
            new Medicine("Paracetamol", 25.0, 2026),
            new Medicine("Ibuprofen", 25.0, 2025),
            new Medicine("Amoxicillin", 30.0, 2027)
        );

        meds.sort(Comparator.comparingDouble((Medicine m) -> m.price)
            .thenComparing((m1, m2) -> Integer.compare(m2.expiryYear, m1.expiryYear)));

        meds.forEach(System.out::println);
    }
}
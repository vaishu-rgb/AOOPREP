package javagenericsandfunctionalprogramming;
class Pair<K, V> {
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>();
        student.set(101, "Vaishnavi");

        Pair<String, Double> product = new Pair<>();
        product.set("Laptop", 75000.0);

        System.out.println("Student: ID=" + student.getKey() + ", Name=" + student.getValue());
        System.out.println("Product: Name=" + product.getKey() + ", Price=₹" + product.getValue());
    }
}
package javagenericsandfunctionalprogramming;
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class BoxUtility {
    public static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        return b1.get().equals(b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> intBox1 = new Box<>();
        Box<Integer> intBox2 = new Box<>();
        intBox1.set(100);
        intBox2.set(100);
        System.out.println("Boxes equal? " + compareBoxes(intBox1, intBox2));
    }
}
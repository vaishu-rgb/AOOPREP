package assignment1;

public class HeapStackDemo {
    private String name;

    public HeapStackDemo(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called for: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        int localCounter = 0;

        for (int i = 1; i <= 5; i++) {
            HeapStackDemo obj = new HeapStackDemo("Object-" + i);
            localCounter += i;
            obj = null;
        }

        System.gc();
        System.out.println("Main method complete. Local counter: " + localCounter);
    }
}
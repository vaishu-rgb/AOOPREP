public class ReflectionDemo1 {
    static class Product {
        public void showDetails() {
            System.out.println("Product: Reflection-enabled gadget");
        }
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionDemo1$Product");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getMethod("showDetails").invoke(obj);
    }
}
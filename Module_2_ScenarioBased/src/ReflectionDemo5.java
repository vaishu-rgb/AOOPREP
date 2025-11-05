import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo5 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface NotEmpty {}

    static class Customer {
        @NotEmpty
        public String name = "";
    }

    public static void main(String[] args) throws Exception {
        Customer c = new Customer();
        for (Field f : c.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                if (((String) f.get(c)).isEmpty()) {
                    System.out.println("⚠️ Field '" + f.getName() + "' must not be empty.");
                }
            }
        }
    }
}
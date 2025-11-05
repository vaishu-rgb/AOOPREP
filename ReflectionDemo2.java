import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo2 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    @interface APIDescription {
        String description();
    }

    @APIDescription(description = "Handles product operations")
    static class ProductAPI {
        @APIDescription(description = "Returns product details")
        public void getProduct() {}
    }

    public static void main(String[] args) {
        Class<ProductAPI> clazz = ProductAPI.class;

        if (clazz.isAnnotationPresent(APIDescription.class)) {
            System.out.println("Class: " + clazz.getAnnotation(APIDescription.class).description());
        }

        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                System.out.println("Method: " + m.getName() + " → " + m.getAnnotation(APIDescription.class).description());
            }
        }
    }
}
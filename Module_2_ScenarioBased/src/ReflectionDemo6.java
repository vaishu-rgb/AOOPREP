import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo6 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface RoleAllowed {
        String role();
    }

    static class UserService {
        @RoleAllowed(role = "ADMIN")
        public void deleteUser() {}

        @RoleAllowed(role = "USER")
        public void viewProfile() {}
    }

    public static void main(String[] args) {
        String currentRole = "USER";
        for (Method m : UserService.class.getDeclaredMethods()) {
            RoleAllowed r = m.getAnnotation(RoleAllowed.class);
            if (r != null) {
                System.out.println("Method: " + m.getName());
                System.out.println(r.role().equals(currentRole) ? "✅ Access granted" : "❌ Access denied");
            }
        }
    }
}
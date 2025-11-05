import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo3 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface APIInfo {
        String endpoint();
        String method();
    }

    static class UserAPI {
        @APIInfo(endpoint = "/users", method = "GET")
        public void getUsers() {}

        @APIInfo(endpoint = "/users", method = "POST")
        public void createUser() {}
    }

    public static void main(String[] args) {
        for (Method m : UserAPI.class.getDeclaredMethods()) {
            APIInfo info = m.getAnnotation(APIInfo.class);
            if (info != null) {
                System.out.println(info.method() + " " + info.endpoint());
            }
        }
    }
}
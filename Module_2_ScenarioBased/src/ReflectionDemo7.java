import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo7 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Loggable {
        String message();
    }

    static class AccountService {
        @Loggable(message = "Depositing funds")
        public void deposit() {
            System.out.println("Deposit executed.");
        }

        @Loggable(message = "Withdrawing funds")
        public void withdraw() {
            System.out.println("Withdraw executed.");
        }
    }

    public static void main(String[] args) throws Exception {
        AccountService service = new AccountService();
        for (Method m : AccountService.class.getDeclaredMethods()) {
            Loggable log = m.getAnnotation(Loggable.class);
            if (log != null) {
                System.out.println("📋 " + log.message());
                m.invoke(service);
            }
        }
    }
}
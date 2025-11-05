import java.lang.annotation.*;

public class ReflectionDemo8 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Version {
        String number();
    }

    @Version(number = "1.2")
    static class ReportGenerator {
        public void generate() {
            System.out.println("Report generated.");
        }
    }

    public static void main(String[] args) {
        Version v = ReportGenerator.class.getAnnotation(Version.class);
        if (v != null) {
            System.out.println("📦 Version: " + v.number());
        }
    }
}
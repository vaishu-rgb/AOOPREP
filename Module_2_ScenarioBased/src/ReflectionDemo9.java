import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionDemo9 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface TestCase {}

    static class CalculatorTest {
        @TestCase
        public void testAdd() {
            System.out.println("testAdd passed");
        }

        @TestCase
        public void testSubtract() {
            System.out.println("testSubtract passed");
        }

        public void helper() {}
    }

    public static void main(String[] args) throws Exception {
        CalculatorTest test = new CalculatorTest();
        for (Method m : CalculatorTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(TestCase.class)) {
                System.out.println("🧪 Running: " + m.getName());
                m.invoke(test);
            }
        }
    }
}
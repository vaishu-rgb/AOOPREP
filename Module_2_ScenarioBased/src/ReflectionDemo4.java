import java.lang.reflect.*;

public class ReflectionDemo4 {
    static class Debuggable {
        private int id;
        public String name;

        public void run() {}
        private void log() {}
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Debuggable.class;

        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(" - " + f.getName() + " : " + f.getType().getSimpleName());
        }

        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(" - " + m.getName());
        }
    }
}
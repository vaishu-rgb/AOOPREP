package javagenericsandfunctionalprogramming;
import java.util.*;
import java.util.function.*;

class User {
    String name;
    int steps;

    User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
            new User("Anjali", 12000),
            new User("Ravi", 9500),
            new User("Meena", 15000)
        );

        Predicate<User> isActive = u -> u.steps > 10000;
        Consumer<User> display = u -> System.out.println(u.name + " - " + u.steps + " steps");

        users.stream().filter(isActive).forEach(display);

        System.out.println("\nFunctional interfaces like Predicate and Consumer promote declarative programming by separating logic from control flow, making code modular and readable.");
    }
}
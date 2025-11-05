package javagenericsandfunctionalprogramming;

public class DietTracker {

}import java.util.*;
import java.util.function.*;

public class DietTracker {
    public static void main(String[] args) {
        List<Integer> calories = Arrays.asList(1800, 2200, 2500, 1900);

        Consumer<Integer> displayHighCalories = c -> {
            if (c > 2000) System.out.println("High intake: " + c + " calories");
        };

        calories.forEach(displayHighCalories);
    }
}

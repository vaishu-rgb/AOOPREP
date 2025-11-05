package javagenericsandfunctionalprogramming;
import java.util.*;
import java.util.function.*;

public class CricketAnalytics {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(45, 60, 30, 85, 55);

        Predicate<Integer> isAboveFifty = score -> score > 50;

        scores.stream().filter(isAboveFifty).forEach(System.out::println);
    }
}
package javagenericsandfunctionalprogramming;
import java.util.*;

class Team<T> {
    private List<T> players = new ArrayList<>();

    public void addPlayer(T player) {
        players.add(player);
    }

    public void displayPlayers() {
        players.forEach(System.out::println);
    }
}

public class TeamManager {
    public static void main(String[] args) {
        Team<String> cricketTeam = new Team<>();
        cricketTeam.addPlayer("Virat");
        cricketTeam.addPlayer("Rohit");

        Team<String> footballTeam = new Team<>();
        footballTeam.addPlayer("Messi");
        footballTeam.addPlayer("Ronaldo");

        System.out.println("Cricket Team:");
        cricketTeam.displayPlayers();

        System.out.println("Football Team:");
        footballTeam.displayPlayers();
    }
}
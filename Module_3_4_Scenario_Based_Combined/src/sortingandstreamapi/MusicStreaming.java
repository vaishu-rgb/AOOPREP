package sortingandstreamapi;
import java.util.*;
import java.util.stream.*;

class Song {
    String title;
    String artist;
    double duration; // in minutes

    Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
}

public class MusicStreaming {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
            new Song("Melody", "Asha", 2.5),
            new Song("Rhythm", "Ravi", 3.2),
            new Song("Harmony", "Neha", 4.0)
        );

        List<String> longSongs = songs.stream()
            .filter(s -> s.duration > 3.0)
            .map(s -> s.title)
            .collect(Collectors.toList());

        System.out.println("Songs longer than 3 minutes: " + longSongs);
        System.out.println("\nStreams enable efficient filtering and transformation with minimal boilerplate.");
    }
}
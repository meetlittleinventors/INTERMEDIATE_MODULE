import java.util.ArrayList;
import java.util.Collections;

public class PlaylistManager {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist: " + playlist);

        // Play songs in order
        for (String song : playlist) {
            System.out.println("Playing: " + song);
        }

        // Shuffle playlist
        Collections.shuffle(playlist);
        System.out.println("Shuffled Playlist: " + playlist);

        // Remove a song
        playlist.remove("Song B");
        System.out.println("After Removing: " + playlist);

        // Wrap-around play (circular)
        System.out.println("Circular Play:");
        for (int i = 0; i < playlist.size() * 2; i++) {
            System.out.println("Playing: " + playlist.get(i % playlist.size()));
        }
    }
}

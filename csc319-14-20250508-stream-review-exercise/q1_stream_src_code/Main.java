import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Main so we can call the findLongTracks method here
        Main filter = new Main();

        // Convert the albums from SampleData to a List<Album>
        List<Album> albums = SampleData.albums.collect(Collectors.toList());

        // The traditional for-loop method to find long track names
        Set<String> result1 = filter.findLongTracks(albums);
        // The Stream-based method to find long track names
        Set<String> result2 = filter.findLongTracksWithStream(albums);

        // Print results from the traditional version
        System.out.println("Original Result:");
        result1.forEach(System.out::println);

        System.out.println("----------------------");

        // Print results from the Stream version
        System.out.println("Stream Result:");
        result2.forEach(System.out::println);
    }

    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>(); // Create a Set to store track names without duplicates
        for (Album album : albums) { // Loop through each album
            for (Track track : album.getTrackList()) { // Loop through each track in the album
                if (track.getLength() > 60) { // Check if the track length is greater than 60
                    String name = track.getName(); // Get the name of the track
                    trackNames.add(name); // Add it to the result set
                }
            }
        }
        return trackNames; // Return the result set
    }

    public Set<String> findLongTracksWithStream(List<Album> albums) {
        return albums.stream() // Convert the list of albums into a Stream<Album>
                .flatMap(album -> album.getTrackList().stream()) // For each album, convert its track list into a stream and flatten them into one stream of Track
                .filter(track -> track.getLength() > 60) // Keep only tracks that are longer than 60 seconds
                .map(Track::getName) // Extract the name of each track
                .collect(Collectors.toSet()); // Collect the names into a Set to remove duplicates
    }
}
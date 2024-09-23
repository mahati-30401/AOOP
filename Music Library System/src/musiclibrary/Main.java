package musiclibrary;

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Add some music
        library.addMusic(new Music("Song A", "Artist 1", "Pop", 2020));
        library.addMusic(new Music("Song B", "Artist 2", "Rock", 2021));
        library.addMusic(new Music("Song C", "Artist 1", "Jazz", 2019));

        // Sort by title and print
        System.out.println("Music sorted by title:");
        library.sortByTitle();
        for (Music music : library) {
            System.out.println(music);
        }

        // Sort by artist and print
        System.out.println("\nMusic sorted by artist:");
        library.sortByArtist();
        for (Music music : library) {
            System.out.println(music);
        }
    }
}

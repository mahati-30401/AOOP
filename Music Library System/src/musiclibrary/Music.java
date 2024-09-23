package musiclibrary;
	public class Music implements Comparable<Music>, Cloneable {
	    private String title;
	    private String artist;
	    private String genre;
	    private int year;

	    public Music(String title, String artist, String genre, int year) {
	        this.title = title;
	        this.artist = artist;
	        this.genre = genre;
	        this.year = year;
	    }

	    // Getters
	    public String getTitle() { return title; }
	    public String getArtist() { return artist; }
	    public String getGenre() { return genre; }
	    public int getYear() { return year; }

	    @Override
	    public int compareTo(Music other) {
	        return this.title.compareTo(other.title);
	    }

	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    @Override
	    public String toString() {
	        return title + " by " + artist + " (" + genre + ", " + year + ")";
	    }
	}



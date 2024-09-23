package musiclibrary;

	import java.util.Comparator;

	public class MusicArtistComparator implements Comparator<Music> {
	    @Override
	    public int compare(Music m1, Music m2) {
	        return m1.getArtist().compareTo(m2.getArtist());
	    }
	}

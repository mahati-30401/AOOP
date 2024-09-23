package musiclibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MusicLibrary implements Iterable<Music> {
    private List<Music> musicList;

    public MusicLibrary() {
        musicList = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musicList.add(music);
    }

    public void sortByTitle() {
        Collections.sort(musicList);
    }

    public void sortByArtist() {
        Collections.sort(musicList, new MusicArtistComparator());
    }

    @Override
    public Iterator<Music> iterator() {
        return musicList.iterator();
    }
}

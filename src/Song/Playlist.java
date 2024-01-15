package Song;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public int getTotalDuration() {
        int totalDuration =0;

        for (Song song: songs) {
            totalDuration += song.getDuration();

        }

        return totalDuration;
    }

    public void save() {
        File file = new File("playlist.csv");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            for(Song song : songs) {
                ps.println(song.getTitle() + ", "+ song.getArtist()+", " + song.getDuration());
            }
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

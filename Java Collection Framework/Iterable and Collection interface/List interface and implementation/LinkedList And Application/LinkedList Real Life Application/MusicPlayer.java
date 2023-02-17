package Java_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class MusicPlayer {
    private LinkedList<Song> playList;

    public MusicPlayer() {
        playList = new LinkedList<>();
    }

    public void addMusic(Song song) {
        playList.add(song);
    }

    public void addMusicToFirst(Song song) {
        playList.addFirst(song);
    }

    public void addMusicToLast(Song song) {
        playList.addLast(song);
    }

    public Song searchSong(String songName) throws SongNotFoundException {
        for (Song song : playList) {
            if (song.getSong().equals(songName)) {
                return song;
            }
        }
        throw new SongNotFoundException("The song " + songName + " was not found in the playlist");
    }

    public void removeMusic(String name) throws SongNotFoundException {
        playList.remove(searchSong(name));
    }

    public Song removeFirst() {
        return playList.removeFirst();
    }

    public Song removeLast() {
        return playList.removeLast();
    }

    public Song playNext() {
        Song nextSong = playList.poll();
        if (nextSong != null) {
            System.out.println(nextSong.getArtist() + "--" + nextSong.getSong() + "--" + nextSong.getDuration());
            playList.addLast(nextSong);
        }
        return nextSong;
    }

    public boolean shufflePlayList() {
        for (int i = 0; i < playList.size(); i++) {
            int randomIndex = (int) (Math.random() * playList.size());
            Song randomSong = playList.remove(randomIndex);
            playList.add(randomSong);
        }
        return true;
    }

    public void listOfSongs() {
        for (Song song : playList) {
            String songDetails = song.getArtist() + " - " + song.getSong() + " - " + song.getDuration() + " seconds";
            System.out.println(songDetails);
            System.out.println("===================================");
        }
    }



    static class Song {
        private String artist;
        private String song;
        private int duration;

        Song(String artist, String song, int duration) {
            this.artist = artist;
            this.song = song;
            this.duration = duration;
        }

        public String getArtist() {
            return this.artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getSong() {
            return song;
        }

        public void setSong(String song) {
            this.song = song;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }
    }

    static class SongNotFoundException extends Exception {
        public SongNotFoundException(String message) {
            super(message);
        }
    }
}


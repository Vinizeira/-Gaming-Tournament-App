package com.vn.challenge;

public class Music extends Audio {
    private String artist; // artist / band name
    private String album;  // album name
    private String genre; // (Jazz, Pop, Rock,etc.)

    public Music(String title, int duration, String artist, String album, String genre) {
        super(title, duration);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Music: " + getTitle() +
                "| Artist: " + artist +
                "| Album: " + album +
                "| Genre: " + genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

}

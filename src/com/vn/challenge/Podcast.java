package com.vn.challenge;

public class Podcast extends Audio{
    private String host; //podcast host name
    private String description; //episode summary
    private int episodeNumber; // episode ID

    public Podcast(String title, int duration, String host, String description, int episodeNumber) {
        super(title, duration);
        this.host = host;
        this.description = description;
        this.episodeNumber = episodeNumber;
    }

    @Override
    public String toString(){
        return "Podcast: " + getTitle() +
                "| Host: " + host +
                "| Episode: " + episodeNumber;
    }

    public String getHost() {
        return host;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getDescription() {
        return description;
    }
}

package com.vn.challenge;

public class Audio implements Playable {
    private String title;
    private int duration;
    private int totalPlays;
    private int likes;
    private double rating;

    public Audio(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.totalPlays = 0;
        this.likes = 0;
    }

    @Override
    public void play() {
        totalPlays++;
        calculateRating();
    }
    @Override
    public void like() {
        likes++;
        calculateRating();
    }
    @Override
    public double getRating() {
        return rating;
    }

    private void calculateRating() {
        if (totalPlays > 0) {
            rating = (double) likes / totalPlays * 5; //type casting
            if (rating > 5.0) rating = 5.0;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getLikes() {
        return likes;
    }
}

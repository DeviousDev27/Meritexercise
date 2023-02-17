package com.techelevator;

// Movie.java
public class Movie extends MediaItem {
    private String rating;
    private int runLength;

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getRunLength() {
        return runLength;
    }
    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }
    // Movie.java
    public Movie(String title, String rating, int runLength, double price) {
        this.title = title;
        this.rating = rating;
        this.runLength = runLength;
        this.price = price;
    }
    // Movie.java
    @Override
    public String toString() {
        return "Title: " + title + ", Rating: " + rating + ", Time: " + runLength + " minutes, Price: $" + price;
    }
}
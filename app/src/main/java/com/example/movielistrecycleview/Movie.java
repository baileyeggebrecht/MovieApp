package com.example.movielistrecycleview;

public class Movie {
    private int id;
    private String name;
    private String whoRecommended;
    private String imageURL;
    private int awfulRating;

    public Movie(int id, String name, String whoRecommended, String imageURL, int awfulRating) {
        this.id = id;
        this.name = name;
        this.whoRecommended = whoRecommended;
        this.imageURL = imageURL;
        this.awfulRating = awfulRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", whoRecommended='" + whoRecommended + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", awfulRating=" + awfulRating +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhoRecommended() {
        return whoRecommended;
    }

    public void setWhoRecommended(String whoRecommended) {
        this.whoRecommended = whoRecommended;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getAwfulRating() {
        return awfulRating;
    }

    public void setAwfulRating(int awfulRating) {
        this.awfulRating = awfulRating;
    }
}

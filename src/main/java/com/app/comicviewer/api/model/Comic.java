package com.app.comicviewer.api.model;

public class Comic {

    private Integer id;
    private String title;
    private String author;
    private String genre;
    private String image;
    private String publishDate;
    private double rating;

    public Comic(Integer id, String title, String genre, String author, String image, String publishDate, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.image = image;
        this.publishDate = publishDate;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

package com.anway.droidbuzz;

public class MovieDT {
    String id;
    String mvoie_title;
    String movide_description;
    int movie_rating;

    public MovieDT() { }

    public MovieDT(String id, String mvoie_title, String movide_description, int movie_rating) {
        this.id = id;
        this.mvoie_title = mvoie_title;
        this.movide_description = movide_description;
        this.movie_rating = movie_rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMvoie_title() {
        return mvoie_title;
    }

    public void setMvoie_title(String mvoie_title) {
        this.mvoie_title = mvoie_title;
    }

    public String getMovide_description() {
        return movide_description;
    }

    public void setMovide_description(String movide_description) {
        this.movide_description = movide_description;
    }

    public int getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(int movie_rating) {
        this.movie_rating = movie_rating;
    }
}

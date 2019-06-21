package com.developer.abhinavraj.moviesearch.Model;

public class movie {

    String type;
    int score;
    String overview;
    String original_language;
    String original_title;
    String genres;
    int release_year;
    String tagline;
    String poster_path;


    public movie(String type, int score, String overview, String original_language, String original_title, String genres, int release_year, String tagline, String poster_path) {
        this.type = type;
        this.score = score;
        this.overview = overview;
        this.original_language = original_language;
        this.original_title = original_title;
        this.genres = genres;
        this.release_year = release_year;
        this.tagline = tagline;
        this.poster_path = poster_path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }



}

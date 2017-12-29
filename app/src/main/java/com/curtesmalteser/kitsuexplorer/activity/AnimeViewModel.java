package com.curtesmalteser.kitsuexplorer.activity;

import android.graphics.Bitmap;

/**
 * Created by "Curtes Maltese" on 23/12/2017.
 */

public class AnimeViewModel {

    private String title;
    private String rating;
    private String posterUrl;

    public AnimeViewModel(String title, String rating, String posterUrl) {
        this.title = title;
        this.rating = rating;
        this.posterUrl = posterUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}

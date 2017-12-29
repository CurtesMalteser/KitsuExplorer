
package com.curtesmalteser.kitsuexplorer.api.api_model.model_manga;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.*;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Castings;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Categories;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Installments;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Mappings;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.MediaRelationships;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationships {

    @SerializedName("genres")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Genres genres;
    @SerializedName("categories")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Categories categories;
    @SerializedName("castings")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Castings castings;
    @SerializedName("installments")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Installments installments;
    @SerializedName("mappings")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Mappings mappings;
    @SerializedName("reviews")
    @Expose
    private Reviews reviews;
    @SerializedName("mediaRelationships")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.MediaRelationships mediaRelationships;
    @SerializedName("chapters")
    @Expose
    private Chapters chapters;
    @SerializedName("mangaCharacters")
    @Expose
    private MangaCharacters mangaCharacters;
    @SerializedName("mangaStaff")
    @Expose
    private MangaStaff mangaStaff;

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Genres getGenres() {
        return genres;
    }

    public void setGenres(com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Genres genres) {
        this.genres = genres;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Castings getCastings() {
        return castings;
    }

    public void setCastings(Castings castings) {
        this.castings = castings;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Mappings getMappings() {
        return mappings;
    }

    public void setMappings(Mappings mappings) {
        this.mappings = mappings;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.MediaRelationships getMediaRelationships() {
        return mediaRelationships;
    }

    public void setMediaRelationships(MediaRelationships mediaRelationships) {
        this.mediaRelationships = mediaRelationships;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public MangaCharacters getMangaCharacters() {
        return mangaCharacters;
    }

    public void setMangaCharacters(MangaCharacters mangaCharacters) {
        this.mangaCharacters = mangaCharacters;
    }

    public MangaStaff getMangaStaff() {
        return mangaStaff;
    }

    public void setMangaStaff(MangaStaff mangaStaff) {
        this.mangaStaff = mangaStaff;
    }

}

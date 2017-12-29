
package com.curtesmalteser.kitsuexplorer.api.api_model.model_manga;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.PosterImage;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.RatingFrequencies;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Titles;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("coverImageTopOffset")
    @Expose
    private Integer coverImageTopOffset;
    @SerializedName("titles")
    @Expose
    private Titles titles;
    @SerializedName("canonicalTitle")
    @Expose
    private String canonicalTitle;
    @SerializedName("abbreviatedTitles")
    @Expose
    private Object abbreviatedTitles;
    @SerializedName("averageRating")
    @Expose
    private Object averageRating;
    @SerializedName("ratingFrequencies")
    @Expose
    private RatingFrequencies ratingFrequencies;
    @SerializedName("userCount")
    @Expose
    private Integer userCount;
    @SerializedName("favoritesCount")
    @Expose
    private Integer favoritesCount;
    @SerializedName("startDate")
    @Expose
    private Object startDate;
    @SerializedName("endDate")
    @Expose
    private Object endDate;
    @SerializedName("popularityRank")
    @Expose
    private Integer popularityRank;
    @SerializedName("ratingRank")
    @Expose
    private Object ratingRank;
    @SerializedName("ageRating")
    @Expose
    private String ageRating;
    @SerializedName("ageRatingGuide")
    @Expose
    private Object ageRatingGuide;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tba")
    @Expose
    private Object tba;
    @SerializedName("posterImage")
    @Expose
    private PosterImage posterImage;
    @SerializedName("coverImage")
    @Expose
    private Object coverImage;
    @SerializedName("chapterCount")
    @Expose
    private Object chapterCount;
    @SerializedName("volumeCount")
    @Expose
    private Integer volumeCount;
    @SerializedName("serialization")
    @Expose
    private String serialization;
    @SerializedName("mangaType")
    @Expose
    private String mangaType;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getCoverImageTopOffset() {
        return coverImageTopOffset;
    }

    public void setCoverImageTopOffset(Integer coverImageTopOffset) {
        this.coverImageTopOffset = coverImageTopOffset;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public String getCanonicalTitle() {
        return canonicalTitle;
    }

    public void setCanonicalTitle(String canonicalTitle) {
        this.canonicalTitle = canonicalTitle;
    }

    public Object getAbbreviatedTitles() {
        return abbreviatedTitles;
    }

    public void setAbbreviatedTitles(Object abbreviatedTitles) {
        this.abbreviatedTitles = abbreviatedTitles;
    }

    public Object getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Object averageRating) {
        this.averageRating = averageRating;
    }

    public RatingFrequencies getRatingFrequencies() {
        return ratingFrequencies;
    }

    public void setRatingFrequencies(RatingFrequencies ratingFrequencies) {
        this.ratingFrequencies = ratingFrequencies;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Integer getPopularityRank() {
        return popularityRank;
    }

    public void setPopularityRank(Integer popularityRank) {
        this.popularityRank = popularityRank;
    }

    public Object getRatingRank() {
        return ratingRank;
    }

    public void setRatingRank(Object ratingRank) {
        this.ratingRank = ratingRank;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public Object getAgeRatingGuide() {
        return ageRatingGuide;
    }

    public void setAgeRatingGuide(Object ageRatingGuide) {
        this.ageRatingGuide = ageRatingGuide;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getTba() {
        return tba;
    }

    public void setTba(Object tba) {
        this.tba = tba;
    }

    public PosterImage getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(PosterImage posterImage) {
        this.posterImage = posterImage;
    }

    public Object getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(Object coverImage) {
        this.coverImage = coverImage;
    }

    public Object getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(Object chapterCount) {
        this.chapterCount = chapterCount;
    }

    public Integer getVolumeCount() {
        return volumeCount;
    }

    public void setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
    }

    public String getSerialization() {
        return serialization;
    }

    public void setSerialization(String serialization) {
        this.serialization = serialization;
    }

    public String getMangaType() {
        return mangaType;
    }

    public void setMangaType(String mangaType) {
        this.mangaType = mangaType;
    }

}

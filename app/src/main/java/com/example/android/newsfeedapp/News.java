package com.example.android.newsfeedapp;

import android.media.Image;

import java.util.Date;

/**
 * An {@link News} object contains information related to a single news.
 */

public class News {

    //Title of the news
    private final String newsTitle;
    // Section name of the news
    private final String newsSectionName;
    //Author name of the news
    private final String newsAuthorName;
    //Publication date of the news
    private final Date newsPublicationDate;
    //Website URL of the news
    private final String newsUrl;
    //Image for the news
    private final String newsImage;

    public News(String title, String section, String authorFullName, Date publicationDate, String url, String image) {
        newsTitle = title;
        newsSectionName = section;
        newsAuthorName = authorFullName;
        newsPublicationDate = publicationDate;
        newsUrl = url;
        newsImage = image;
    }

    public String getTitle() {
        return newsTitle;
    }

    public String getSectionName() {
        return newsSectionName;
    }

    public String getAuthorName() {
        return newsAuthorName;
    }

    public Date getPublicationDate() {
        return newsPublicationDate;
    }

    public String getUrl() {
        return newsUrl;
    }

    public String getImage() {
        return newsImage;
    }
}



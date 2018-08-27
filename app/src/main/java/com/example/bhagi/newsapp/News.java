package com.example.bhagi.newsapp;

public class News {

    private String sectionName;
    private String webTitle;
    private String webUrl;
    private String authorName;
    private String webPublicationDate;

    public News(String headerName, String title, String url, String author, String publicationDate) {
        sectionName = headerName;
        webTitle = title;
        webUrl = url;
        authorName = author;
        webPublicationDate = publicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }
}

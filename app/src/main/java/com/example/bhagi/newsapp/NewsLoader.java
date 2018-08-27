package com.example.bhagi.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    /**
     * Loads a list of earthquakes by using an AsyncTask to perform the
     * network request to the given URL.
     */

    //Query URL
    private String mUrl;

    //Constructor for context and to load data from
    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    //Background Thread
    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<News> news = HttpProcessClass.fetchNewsData(mUrl);
        return news;
    }
}

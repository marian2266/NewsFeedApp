package com.example.android.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of news by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {


    private final String queryUrl;

    /**
     * Call loader custom constructor NewsLoader, pass the context to super class
     * AsyncTaskLoader and store the passed url to be used
     * in the loadInBackground method
     */
    public NewsLoader(Context context, String url) {
        super(context);
        queryUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * Start data fetching in the background process and return the populated list
     * to the overridden onLoadFinished method in MainActivity
     */
    @Override
    public List<News> loadInBackground() {
        if (queryUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of news (and return this data at the end)
        return QueryUtils.fetchNewsData(queryUrl);
    }
}
package com.example.books;

import android.app.DownloadManager;
import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ApiUtil {
    private ApiUtil(){}

    public static final String BASE_API_URI =
            "https://www.googleapis.com/books/v1/volumes";
    public static final String QUERY_PARAMETER_KEY = "q";
    public static final String KEY = "key";
    public static final String Api_KEY = "AIzaSyDub_wda5wBhI3-rxxLozlCQVikq3z0ngA";

    public  static URL buildUrl(String title){

        URL url = null;
        Uri uri = Uri.parse(BASE_API_URI).buildUpon()
                .appendQueryParameter(QUERY_PARAMETER_KEY, title)
                .appendQueryParameter(KEY, Api_KEY)
                .build();
        try {
            url = new URL(uri.toString());

        }
        catch (Exception e) {

        }
        return url;
        }

    public static String getJson(URL url) throws IOException {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            InputStream stream = connection.getInputStream();
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\A");
            boolean hasData = scanner.hasNext();
            if (hasData) {
                return scanner.next();
            } else {
                return null;
            }
        }
        catch (Exception e){
            Log.d("Error", e.toString());
            return null;
        }
        finally {
            connection.disconnect();
        }
    }

    public  static ArrayList<Book> getBooksFromJson(){
        final  String ID = "id";
        final String TITLE = "title";
        final String SUBTITLE= "subtitle";
        final  String AUTHORS = "authors";
        final String PUBLISHER = "publisher";
        final String PUBLISHED_DATE = "publisheddate";
        final String ITEMS = "items";
        ArrayList<Book> books=null;
        return books;
    }
    }



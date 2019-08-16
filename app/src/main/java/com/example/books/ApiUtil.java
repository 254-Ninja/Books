package com.example.books;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiUtil {
    private ApiUtil(){}

    public static final String BASE_API_URI =
            "https://www.googleapis.com/books/v1/volumes";
    public  static URL buildUrl(String title){
        String fullUrl = BASE_API_URI + "?q=" + title;
        URL url = null;
        try {
            url = new URL(fullUrl);
        }
        catch (Exception e) {

        }
        return url;
        }

    public static String getJson(URL url) throws IOException {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream stream = connection.getInputStream();
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\A");
    }
    }



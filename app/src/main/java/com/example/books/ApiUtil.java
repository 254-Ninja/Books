package com.example.books;

import java.net.URL;

public class ApiUtil {
    private ApiUtil(){}

    public static final String BASe_API_URI =
            "https://www.googleapis.com/books/v1/volumes";
    public  static URL buildUrl(String title){
        String fullUrl = BASe_API_URI + "?q="
    }
}

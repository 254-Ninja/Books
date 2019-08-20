package com.example.books;


import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;


public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBookDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_book_detail);
        Book book= getIntent().getParcelableExtra("Book");
        binding.setBook(book);
    }


}

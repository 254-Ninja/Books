package com.example.books;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.books.databinding.ActivityBookDetailsBinding;


public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        Book book = getIntent().getParcelableExtra("Book");
        ActivityBookDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_book_details);
        binding.setBook(book);

    }


}

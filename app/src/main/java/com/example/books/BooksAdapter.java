package com.example.books;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter {

    public class BookViewHolder extends RecyclerView.ViewHolder<BooksAdapter.BookViewHolder>{

        TextView tvTitle;
        TextView tvtAuthors;
        TextView tvDate;
        TextView tvPublisher;

        public BookViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvtAuthors = (TextView) itemView.findViewById(R.id.tvAuthors);
            tvDate = (TextView) itemView.findViewById(R.id.tvPublishedDate);
            tvPublisher = (TextView)itemView.findViewById(R.id.tvPublisher);

        }
        public  void bind (Book book) {
            tvTitle.setText(book.title);
            String authors="";
            int i=0;
            for (String author:book.authors){
                authors+=author;
                i++;
                if(i<book.authors.length){
                    authors+=", ";
                }
            }
            tvtAuthors.setText(authors);
            tvDate.setText(book.publisherData);
            tvPublisher.setText(book.publishers);

        }
    }
}

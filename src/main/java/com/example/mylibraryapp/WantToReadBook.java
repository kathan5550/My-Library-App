package com.example.mylibraryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class WantToReadBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_to_read_book);

        ArrayList<Book> wanttoread = Utils.getWantToReadbooks();
        TextView emptyscr = findViewById(R.id.EmptyScreenMsg);

        if (wanttoread.isEmpty()) {
            emptyscr.setVisibility(View.VISIBLE);
        } else {
            RecyclerView recyclerView = findViewById(R.id.bookREcView);
            BookRecviewAdapter adapter = new BookRecviewAdapter(this, "wantToRead");
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter.setBooks(Utils.getWantToReadbooks());

            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                @Override
                public void onChanged() {
                    //Do some task.
                    ArrayList<Book> wanttoread = Utils.getWantToReadbooks();
                    if (wanttoread.isEmpty()) {
                        recyclerView.setVisibility(View.INVISIBLE);
                        emptyscr.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
    }


    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}